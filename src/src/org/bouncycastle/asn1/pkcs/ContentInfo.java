package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.*;

import java.util.Enumeration;

public class ContentInfo
    implements DEREncodable, PKCSObjectIdentifiers
{
    private DERObjectIdentifier contentType;
    private DEREncodable        content;

    public static ContentInfo getInstance(
        Object  obj)
    {
        if (obj instanceof ContentInfo)
        {
            return (ContentInfo)obj;
        }
        else if (obj instanceof ASN1Sequence)
        {
            return new ContentInfo((ASN1Sequence)obj);
        }

        throw new IllegalArgumentException("unknown object in factory");
    }

    public ContentInfo(
        ASN1Sequence  seq)
    {
        Enumeration   e = seq.getObjects();

        contentType = (DERObjectIdentifier)e.nextElement();

        if (e.hasMoreElements())
        {
            content = ((DERTaggedObject)e.nextElement()).getObject();
        }
    }

    public ContentInfo(
        DERObjectIdentifier contentType,
        DEREncodable        content)
    {
        this.contentType = contentType;
        this.content = content;
    }

    public DERObjectIdentifier getContentType()
    {
        return contentType;
    }

    public DEREncodable getContent()
    {
        return content;
    }

    /**
     * Produce an object suitable for an ASN1OutputStream.
     * <pre>
     * ContentInfo ::= SEQUENCE {
     *          contentType ContentType,
     *          content
     *          [0] EXPLICIT ANY DEFINED BY contentType OPTIONAL }
     * </pre>
     */
    public DERObject getDERObject()
    {
        ASN1EncodableVector  v = new ASN1EncodableVector();

        v.add(contentType);

        if (content != null)
        {
            v.add(new BERTaggedObject(0, content));
        }

        return new BERSequence(v);
    }
}
