// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public class PharmaStaff
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject pharmaStaffMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Professionals("Professionals"),
		NumberOfStaffsRequired("NumberOfStaffsRequired"),
		PharmaStaff_PharmaService("RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff_PharmaService");

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

	public PharmaStaff(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff"));
	}

	protected PharmaStaff(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pharmaStaffMendixObject)
	{
		if (pharmaStaffMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff", pharmaStaffMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff");

		this.pharmaStaffMendixObject = pharmaStaffMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PharmaStaff.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff(context, mendixObject);
	}

	public static requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff.initialize(context, mendixObject);
	}

	public static java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff> result = new java.util.ArrayList<requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff" + xpathConstraint))
			result.add(requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff.initialize(context, obj));
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
	 * Set value of Professionals
	 * @param professionals
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.EnumPharmaProfessionals getProfessionals()
	{
		return getProfessionals(getContext());
	}

	/**
	 * @param context
	 * @return value of Professionals
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.EnumPharmaProfessionals getProfessionals(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Professionals.toString());
		if (obj == null)
			return null;

		return requestforpreliminaryregistrationofafacility_hospital.proxies.EnumPharmaProfessionals.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Professionals
	 * @param professionals
	 */
	public final void setProfessionals(requestforpreliminaryregistrationofafacility_hospital.proxies.EnumPharmaProfessionals professionals)
	{
		setProfessionals(getContext(), professionals);
	}

	/**
	 * Set value of Professionals
	 * @param context
	 * @param professionals
	 */
	public final void setProfessionals(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.EnumPharmaProfessionals professionals)
	{
		if (professionals != null)
			getMendixObject().setValue(context, MemberNames.Professionals.toString(), professionals.toString());
		else
			getMendixObject().setValue(context, MemberNames.Professionals.toString(), null);
	}

	/**
	 * @return value of NumberOfStaffsRequired
	 */
	public final java.lang.Integer getNumberOfStaffsRequired()
	{
		return getNumberOfStaffsRequired(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfStaffsRequired
	 */
	public final java.lang.Integer getNumberOfStaffsRequired(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfStaffsRequired.toString());
	}

	/**
	 * Set value of NumberOfStaffsRequired
	 * @param numberofstaffsrequired
	 */
	public final void setNumberOfStaffsRequired(java.lang.Integer numberofstaffsrequired)
	{
		setNumberOfStaffsRequired(getContext(), numberofstaffsrequired);
	}

	/**
	 * Set value of NumberOfStaffsRequired
	 * @param context
	 * @param numberofstaffsrequired
	 */
	public final void setNumberOfStaffsRequired(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofstaffsrequired)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfStaffsRequired.toString(), numberofstaffsrequired);
	}

	/**
	 * @return value of PharmaStaff_PharmaService
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService getPharmaStaff_PharmaService() throws com.mendix.core.CoreException
	{
		return getPharmaStaff_PharmaService(getContext());
	}

	/**
	 * @param context
	 * @return value of PharmaStaff_PharmaService
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService getPharmaStaff_PharmaService(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PharmaStaff_PharmaService.toString());
		if (identifier != null)
			result = requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PharmaStaff_PharmaService
	 * @param pharmastaff_pharmaservice
	 */
	public final void setPharmaStaff_PharmaService(requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService pharmastaff_pharmaservice)
	{
		setPharmaStaff_PharmaService(getContext(), pharmastaff_pharmaservice);
	}

	/**
	 * Set value of PharmaStaff_PharmaService
	 * @param context
	 * @param pharmastaff_pharmaservice
	 */
	public final void setPharmaStaff_PharmaService(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaService pharmastaff_pharmaservice)
	{
		if (pharmastaff_pharmaservice == null)
			getMendixObject().setValue(context, MemberNames.PharmaStaff_PharmaService.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PharmaStaff_PharmaService.toString(), pharmastaff_pharmaservice.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return pharmaStaffMendixObject;
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
			final requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff that = (requestforpreliminaryregistrationofafacility_hospital.proxies.PharmaStaff) obj;
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
		return "RequestforPreliminaryRegistrationofaFacility_Hospital.PharmaStaff";
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
