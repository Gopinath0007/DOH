// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class ProfileImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.ProfileImage";

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
		Profile_ProfileImage("MyFirstModule.Profile_ProfileImage");

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

	public ProfileImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.ProfileImage"));
	}

	protected ProfileImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject profileImageMendixObject)
	{
		super(context, profileImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.ProfileImage", profileImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.ProfileImage");
	}

	/**
	 * @deprecated Use 'ProfileImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.ProfileImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.ProfileImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.ProfileImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.ProfileImage(context, mendixObject);
	}

	public static myfirstmodule.proxies.ProfileImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.ProfileImage.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.ProfileImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.ProfileImage> result = new java.util.ArrayList<myfirstmodule.proxies.ProfileImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.ProfileImage" + xpathConstraint))
			result.add(myfirstmodule.proxies.ProfileImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Profile_ProfileImage
	 */
	public final myfirstmodule.proxies.Profile getProfile_ProfileImage() throws com.mendix.core.CoreException
	{
		return getProfile_ProfileImage(getContext());
	}

	/**
	 * @param context
	 * @return value of Profile_ProfileImage
	 */
	public final myfirstmodule.proxies.Profile getProfile_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Profile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Profile_ProfileImage.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Profile.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Profile_ProfileImage
	 * @param profile_profileimage
	 */
	public final void setProfile_ProfileImage(myfirstmodule.proxies.Profile profile_profileimage)
	{
		setProfile_ProfileImage(getContext(), profile_profileimage);
	}

	/**
	 * Set value of Profile_ProfileImage
	 * @param context
	 * @param profile_profileimage
	 */
	public final void setProfile_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Profile profile_profileimage)
	{
		if (profile_profileimage == null)
			getMendixObject().setValue(context, MemberNames.Profile_ProfileImage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Profile_ProfileImage.toString(), profile_profileimage.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.ProfileImage that = (myfirstmodule.proxies.ProfileImage) obj;
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
		return "MyFirstModule.ProfileImage";
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
