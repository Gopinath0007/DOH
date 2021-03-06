// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class ContactUs
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contactUsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.ContactUs";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		Email_Address("Email_Address"),
		Phone_Number("Phone_Number"),
		Inquire_About("Inquire_About"),
		Comments("Comments"),
		Status("Status"),
		Inquiry_No("Inquiry_No"),
		AppliedDate("AppliedDate"),
		DOH_Comments("DOH_Comments"),
		ContactUs_Account("MyFirstModule.ContactUs_Account");

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

	public ContactUs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.ContactUs"));
	}

	protected ContactUs(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contactUsMendixObject)
	{
		if (contactUsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.ContactUs", contactUsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.ContactUs");

		this.contactUsMendixObject = contactUsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ContactUs.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.ContactUs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.ContactUs.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.ContactUs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.ContactUs(context, mendixObject);
	}

	public static myfirstmodule.proxies.ContactUs load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.ContactUs.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.ContactUs> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.ContactUs> result = new java.util.ArrayList<myfirstmodule.proxies.ContactUs>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.ContactUs" + xpathConstraint))
			result.add(myfirstmodule.proxies.ContactUs.initialize(context, obj));
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
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email_Address
	 */
	public final java.lang.String getEmail_Address()
	{
		return getEmail_Address(getContext());
	}

	/**
	 * @param context
	 * @return value of Email_Address
	 */
	public final java.lang.String getEmail_Address(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email_Address.toString());
	}

	/**
	 * Set value of Email_Address
	 * @param email_address
	 */
	public final void setEmail_Address(java.lang.String email_address)
	{
		setEmail_Address(getContext(), email_address);
	}

	/**
	 * Set value of Email_Address
	 * @param context
	 * @param email_address
	 */
	public final void setEmail_Address(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email_address)
	{
		getMendixObject().setValue(context, MemberNames.Email_Address.toString(), email_address);
	}

	/**
	 * @return value of Phone_Number
	 */
	public final java.lang.String getPhone_Number()
	{
		return getPhone_Number(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone_Number
	 */
	public final java.lang.String getPhone_Number(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Phone_Number.toString());
	}

	/**
	 * Set value of Phone_Number
	 * @param phone_number
	 */
	public final void setPhone_Number(java.lang.String phone_number)
	{
		setPhone_Number(getContext(), phone_number);
	}

	/**
	 * Set value of Phone_Number
	 * @param context
	 * @param phone_number
	 */
	public final void setPhone_Number(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone_number)
	{
		getMendixObject().setValue(context, MemberNames.Phone_Number.toString(), phone_number);
	}

	/**
	 * Set value of Inquire_About
	 * @param inquire_about
	 */
	public final myfirstmodule.proxies.ENUM_Inquiry getInquire_About()
	{
		return getInquire_About(getContext());
	}

	/**
	 * @param context
	 * @return value of Inquire_About
	 */
	public final myfirstmodule.proxies.ENUM_Inquiry getInquire_About(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Inquire_About.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.ENUM_Inquiry.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Inquire_About
	 * @param inquire_about
	 */
	public final void setInquire_About(myfirstmodule.proxies.ENUM_Inquiry inquire_about)
	{
		setInquire_About(getContext(), inquire_about);
	}

	/**
	 * Set value of Inquire_About
	 * @param context
	 * @param inquire_about
	 */
	public final void setInquire_About(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.ENUM_Inquiry inquire_about)
	{
		if (inquire_about != null)
			getMendixObject().setValue(context, MemberNames.Inquire_About.toString(), inquire_about.toString());
		else
			getMendixObject().setValue(context, MemberNames.Inquire_About.toString(), null);
	}

	/**
	 * @return value of Comments
	 */
	public final java.lang.String getComments()
	{
		return getComments(getContext());
	}

	/**
	 * @param context
	 * @return value of Comments
	 */
	public final java.lang.String getComments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Comments.toString());
	}

	/**
	 * Set value of Comments
	 * @param comments
	 */
	public final void setComments(java.lang.String comments)
	{
		setComments(getContext(), comments);
	}

	/**
	 * Set value of Comments
	 * @param context
	 * @param comments
	 */
	public final void setComments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String comments)
	{
		getMendixObject().setValue(context, MemberNames.Comments.toString(), comments);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final myfirstmodule.proxies.ENUM_Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final myfirstmodule.proxies.ENUM_Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.ENUM_Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(myfirstmodule.proxies.ENUM_Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.ENUM_Status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Inquiry_No
	 */
	public final java.lang.Long getInquiry_No()
	{
		return getInquiry_No(getContext());
	}

	/**
	 * @param context
	 * @return value of Inquiry_No
	 */
	public final java.lang.Long getInquiry_No(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Inquiry_No.toString());
	}

	/**
	 * Set value of Inquiry_No
	 * @param inquiry_no
	 */
	public final void setInquiry_No(java.lang.Long inquiry_no)
	{
		setInquiry_No(getContext(), inquiry_no);
	}

	/**
	 * Set value of Inquiry_No
	 * @param context
	 * @param inquiry_no
	 */
	public final void setInquiry_No(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long inquiry_no)
	{
		getMendixObject().setValue(context, MemberNames.Inquiry_No.toString(), inquiry_no);
	}

	/**
	 * @return value of AppliedDate
	 */
	public final java.util.Date getAppliedDate()
	{
		return getAppliedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of AppliedDate
	 */
	public final java.util.Date getAppliedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.AppliedDate.toString());
	}

	/**
	 * Set value of AppliedDate
	 * @param applieddate
	 */
	public final void setAppliedDate(java.util.Date applieddate)
	{
		setAppliedDate(getContext(), applieddate);
	}

	/**
	 * Set value of AppliedDate
	 * @param context
	 * @param applieddate
	 */
	public final void setAppliedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date applieddate)
	{
		getMendixObject().setValue(context, MemberNames.AppliedDate.toString(), applieddate);
	}

	/**
	 * @return value of DOH_Comments
	 */
	public final java.lang.String getDOH_Comments()
	{
		return getDOH_Comments(getContext());
	}

	/**
	 * @param context
	 * @return value of DOH_Comments
	 */
	public final java.lang.String getDOH_Comments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DOH_Comments.toString());
	}

	/**
	 * Set value of DOH_Comments
	 * @param doh_comments
	 */
	public final void setDOH_Comments(java.lang.String doh_comments)
	{
		setDOH_Comments(getContext(), doh_comments);
	}

	/**
	 * Set value of DOH_Comments
	 * @param context
	 * @param doh_comments
	 */
	public final void setDOH_Comments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String doh_comments)
	{
		getMendixObject().setValue(context, MemberNames.DOH_Comments.toString(), doh_comments);
	}

	/**
	 * @return value of ContactUs_Account
	 */
	public final administration.proxies.Account getContactUs_Account() throws com.mendix.core.CoreException
	{
		return getContactUs_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactUs_Account
	 */
	public final administration.proxies.Account getContactUs_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContactUs_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContactUs_Account
	 * @param contactus_account
	 */
	public final void setContactUs_Account(administration.proxies.Account contactus_account)
	{
		setContactUs_Account(getContext(), contactus_account);
	}

	/**
	 * Set value of ContactUs_Account
	 * @param context
	 * @param contactus_account
	 */
	public final void setContactUs_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account contactus_account)
	{
		if (contactus_account == null)
			getMendixObject().setValue(context, MemberNames.ContactUs_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContactUs_Account.toString(), contactus_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contactUsMendixObject;
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
			final myfirstmodule.proxies.ContactUs that = (myfirstmodule.proxies.ContactUs) obj;
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
		return "MyFirstModule.ContactUs";
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
