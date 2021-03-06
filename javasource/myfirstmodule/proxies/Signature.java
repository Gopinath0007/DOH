// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Signature extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Signature";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Profile_Signature("MyFirstModule.Profile_Signature"),
		Account_Signature("Administration.Account_Signature");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Signature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Signature"));
	}

	protected Signature(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject signatureMendixObject)
	{
		super(context, signatureMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Signature", signatureMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Signature");
	}

	/**
	 * @deprecated Use 'Signature.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Signature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Signature.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Signature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Signature(context, mendixObject);
	}

	public static myfirstmodule.proxies.Signature load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Signature.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Signature> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Signature> result = new java.util.ArrayList<myfirstmodule.proxies.Signature>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Signature" + xpathConstraint))
			result.add(myfirstmodule.proxies.Signature.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Profile_Signature
	 */
	public final myfirstmodule.proxies.Profile getProfile_Signature() throws com.mendix.core.CoreException
	{
		return getProfile_Signature(getContext());
	}

	/**
	 * @param context
	 * @return value of Profile_Signature
	 */
	public final myfirstmodule.proxies.Profile getProfile_Signature(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Profile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Profile_Signature.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Profile.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Profile_Signature
	 * @param profile_signature
	 */
	public final void setProfile_Signature(myfirstmodule.proxies.Profile profile_signature)
	{
		setProfile_Signature(getContext(), profile_signature);
	}

	/**
	 * Set value of Profile_Signature
	 * @param context
	 * @param profile_signature
	 */
	public final void setProfile_Signature(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Profile profile_signature)
	{
		if (profile_signature == null)
			getMendixObject().setValue(context, MemberNames.Profile_Signature.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Profile_Signature.toString(), profile_signature.getMendixObject().getId());
	}

	/**
	 * @return value of Account_Signature
	 */
	public final administration.proxies.Account getAccount_Signature() throws com.mendix.core.CoreException
	{
		return getAccount_Signature(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_Signature
	 */
	public final administration.proxies.Account getAccount_Signature(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_Signature.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_Signature
	 * @param account_signature
	 */
	public final void setAccount_Signature(administration.proxies.Account account_signature)
	{
		setAccount_Signature(getContext(), account_signature);
	}

	/**
	 * Set value of Account_Signature
	 * @param context
	 * @param account_signature
	 */
	public final void setAccount_Signature(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account account_signature)
	{
		if (account_signature == null)
			getMendixObject().setValue(context, MemberNames.Account_Signature.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_Signature.toString(), account_signature.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Signature that = (myfirstmodule.proxies.Signature) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Signature";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
