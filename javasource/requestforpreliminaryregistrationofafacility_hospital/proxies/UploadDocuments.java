// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public class UploadDocuments extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DocName("DocName"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		UploadDocuments_Preliminary("RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments_Preliminary");

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

	public UploadDocuments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments"));
	}

	protected UploadDocuments(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uploadDocumentsMendixObject)
	{
		super(context, uploadDocumentsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments", uploadDocumentsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments");
	}

	/**
	 * @deprecated Use 'UploadDocuments.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments(context, mendixObject);
	}

	public static requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments.initialize(context, mendixObject);
	}

	public static java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments> result = new java.util.ArrayList<requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments" + xpathConstraint))
			result.add(requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of DocName
	 */
	public final java.lang.String getDocName()
	{
		return getDocName(getContext());
	}

	/**
	 * @param context
	 * @return value of DocName
	 */
	public final java.lang.String getDocName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DocName.toString());
	}

	/**
	 * Set value of DocName
	 * @param docname
	 */
	public final void setDocName(java.lang.String docname)
	{
		setDocName(getContext(), docname);
	}

	/**
	 * Set value of DocName
	 * @param context
	 * @param docname
	 */
	public final void setDocName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String docname)
	{
		getMendixObject().setValue(context, MemberNames.DocName.toString(), docname);
	}

	/**
	 * @return value of UploadDocuments_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getUploadDocuments_Preliminary() throws com.mendix.core.CoreException
	{
		return getUploadDocuments_Preliminary(getContext());
	}

	/**
	 * @param context
	 * @return value of UploadDocuments_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getUploadDocuments_Preliminary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UploadDocuments_Preliminary.toString());
		if (identifier != null)
			result = requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UploadDocuments_Preliminary
	 * @param uploaddocuments_preliminary
	 */
	public final void setUploadDocuments_Preliminary(requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary uploaddocuments_preliminary)
	{
		setUploadDocuments_Preliminary(getContext(), uploaddocuments_preliminary);
	}

	/**
	 * Set value of UploadDocuments_Preliminary
	 * @param context
	 * @param uploaddocuments_preliminary
	 */
	public final void setUploadDocuments_Preliminary(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary uploaddocuments_preliminary)
	{
		if (uploaddocuments_preliminary == null)
			getMendixObject().setValue(context, MemberNames.UploadDocuments_Preliminary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UploadDocuments_Preliminary.toString(), uploaddocuments_preliminary.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments that = (requestforpreliminaryregistrationofafacility_hospital.proxies.UploadDocuments) obj;
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
		return "RequestforPreliminaryRegistrationofaFacility_Hospital.UploadDocuments";
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
