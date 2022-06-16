// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Profile
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject profileMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Profile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PhoneNumber("PhoneNumber"),
		Address("Address"),
		Country("Country"),
		Flag("Flag"),
		Profile_ProfileImage("MyFirstModule.Profile_ProfileImage"),
		Profile_Signature("MyFirstModule.Profile_Signature"),
		Account_Profile("Administration.Account_Profile");

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

	public Profile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Profile"));
	}

	protected Profile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject profileMendixObject)
	{
		if (profileMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Profile", profileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Profile");

		this.profileMendixObject = profileMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Profile.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Profile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Profile.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Profile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Profile(context, mendixObject);
	}

	public static myfirstmodule.proxies.Profile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Profile.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Profile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Profile> result = new java.util.ArrayList<myfirstmodule.proxies.Profile>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Profile" + xpathConstraint))
			result.add(myfirstmodule.proxies.Profile.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PhoneNumber
	 */
	public final java.lang.Long getPhoneNumber()
	{
		return getPhoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PhoneNumber
	 */
	public final java.lang.Long getPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.PhoneNumber.toString());
	}

	/**
	 * Set value of PhoneNumber
	 * @param phonenumber
	 */
	public final void setPhoneNumber(java.lang.Long phonenumber)
	{
		setPhoneNumber(getContext(), phonenumber);
	}

	/**
	 * Set value of PhoneNumber
	 * @param context
	 * @param phonenumber
	 */
	public final void setPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long phonenumber)
	{
		getMendixObject().setValue(context, MemberNames.PhoneNumber.toString(), phonenumber);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
	}

	/**
	 * @return value of Flag
	 */
	public final java.lang.Boolean getFlag()
	{
		return getFlag(getContext());
	}

	/**
	 * @param context
	 * @return value of Flag
	 */
	public final java.lang.Boolean getFlag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Flag.toString());
	}

	/**
	 * Set value of Flag
	 * @param flag
	 */
	public final void setFlag(java.lang.Boolean flag)
	{
		setFlag(getContext(), flag);
	}

	/**
	 * Set value of Flag
	 * @param context
	 * @param flag
	 */
	public final void setFlag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean flag)
	{
		getMendixObject().setValue(context, MemberNames.Flag.toString(), flag);
	}

	/**
	 * @return value of Profile_ProfileImage
	 */
	public final myfirstmodule.proxies.ProfileImage getProfile_ProfileImage() throws com.mendix.core.CoreException
	{
		return getProfile_ProfileImage(getContext());
	}

	/**
	 * @param context
	 * @return value of Profile_ProfileImage
	 */
	public final myfirstmodule.proxies.ProfileImage getProfile_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.ProfileImage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Profile_ProfileImage.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.ProfileImage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Profile_ProfileImage
	 * @param profile_profileimage
	 */
	public final void setProfile_ProfileImage(myfirstmodule.proxies.ProfileImage profile_profileimage)
	{
		setProfile_ProfileImage(getContext(), profile_profileimage);
	}

	/**
	 * Set value of Profile_ProfileImage
	 * @param context
	 * @param profile_profileimage
	 */
	public final void setProfile_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.ProfileImage profile_profileimage)
	{
		if (profile_profileimage == null)
			getMendixObject().setValue(context, MemberNames.Profile_ProfileImage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Profile_ProfileImage.toString(), profile_profileimage.getMendixObject().getId());
	}

	/**
	 * @return value of Profile_Signature
	 */
	public final myfirstmodule.proxies.Signature getProfile_Signature() throws com.mendix.core.CoreException
	{
		return getProfile_Signature(getContext());
	}

	/**
	 * @param context
	 * @return value of Profile_Signature
	 */
	public final myfirstmodule.proxies.Signature getProfile_Signature(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Signature result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Profile_Signature.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Signature.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Profile_Signature
	 * @param profile_signature
	 */
	public final void setProfile_Signature(myfirstmodule.proxies.Signature profile_signature)
	{
		setProfile_Signature(getContext(), profile_signature);
	}

	/**
	 * Set value of Profile_Signature
	 * @param context
	 * @param profile_signature
	 */
	public final void setProfile_Signature(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Signature profile_signature)
	{
		if (profile_signature == null)
			getMendixObject().setValue(context, MemberNames.Profile_Signature.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Profile_Signature.toString(), profile_signature.getMendixObject().getId());
	}

	/**
	 * @return value of Account_Profile
	 */
	public final administration.proxies.Account getAccount_Profile() throws com.mendix.core.CoreException
	{
		return getAccount_Profile(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_Profile
	 */
	public final administration.proxies.Account getAccount_Profile(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_Profile.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_Profile
	 * @param account_profile
	 */
	public final void setAccount_Profile(administration.proxies.Account account_profile)
	{
		setAccount_Profile(getContext(), account_profile);
	}

	/**
	 * Set value of Account_Profile
	 * @param context
	 * @param account_profile
	 */
	public final void setAccount_Profile(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account account_profile)
	{
		if (account_profile == null)
			getMendixObject().setValue(context, MemberNames.Account_Profile.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_Profile.toString(), account_profile.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return profileMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Profile that = (myfirstmodule.proxies.Profile) obj;
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
		return "MyFirstModule.Profile";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}