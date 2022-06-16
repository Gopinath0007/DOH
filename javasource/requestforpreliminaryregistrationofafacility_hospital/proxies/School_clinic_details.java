// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public class School_clinic_details
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject school_clinic_detailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Consultant_room("Consultant_room"),
		treatment_room("treatment_room"),
		CSSD_room("CSSD_room"),
		Educational_level_KG("Educational_level_KG"),
		Educational_level_Primary("Educational_level_Primary"),
		Educational_level_Secondary("Educational_level_Secondary"),
		Educational_level_HighSchool("Educational_level_HighSchool"),
		No_Of_students_male("No_Of_students_male"),
		No_Of_students_female("No_Of_students_female"),
		School_clinic_details_Preliminary("RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details_Preliminary");

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

	public School_clinic_details(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details"));
	}

	protected School_clinic_details(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject school_clinic_detailsMendixObject)
	{
		if (school_clinic_detailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details", school_clinic_detailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details");

		this.school_clinic_detailsMendixObject = school_clinic_detailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'School_clinic_details.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details(context, mendixObject);
	}

	public static requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details.initialize(context, mendixObject);
	}

	public static java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details> result = new java.util.ArrayList<requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details" + xpathConstraint))
			result.add(requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details.initialize(context, obj));
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
	 * @return value of Consultant_room
	 */
	public final java.lang.Integer getConsultant_room()
	{
		return getConsultant_room(getContext());
	}

	/**
	 * @param context
	 * @return value of Consultant_room
	 */
	public final java.lang.Integer getConsultant_room(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Consultant_room.toString());
	}

	/**
	 * Set value of Consultant_room
	 * @param consultant_room
	 */
	public final void setConsultant_room(java.lang.Integer consultant_room)
	{
		setConsultant_room(getContext(), consultant_room);
	}

	/**
	 * Set value of Consultant_room
	 * @param context
	 * @param consultant_room
	 */
	public final void setConsultant_room(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer consultant_room)
	{
		getMendixObject().setValue(context, MemberNames.Consultant_room.toString(), consultant_room);
	}

	/**
	 * @return value of treatment_room
	 */
	public final java.lang.Integer gettreatment_room()
	{
		return gettreatment_room(getContext());
	}

	/**
	 * @param context
	 * @return value of treatment_room
	 */
	public final java.lang.Integer gettreatment_room(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.treatment_room.toString());
	}

	/**
	 * Set value of treatment_room
	 * @param treatment_room
	 */
	public final void settreatment_room(java.lang.Integer treatment_room)
	{
		settreatment_room(getContext(), treatment_room);
	}

	/**
	 * Set value of treatment_room
	 * @param context
	 * @param treatment_room
	 */
	public final void settreatment_room(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer treatment_room)
	{
		getMendixObject().setValue(context, MemberNames.treatment_room.toString(), treatment_room);
	}

	/**
	 * @return value of CSSD_room
	 */
	public final java.lang.Integer getCSSD_room()
	{
		return getCSSD_room(getContext());
	}

	/**
	 * @param context
	 * @return value of CSSD_room
	 */
	public final java.lang.Integer getCSSD_room(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CSSD_room.toString());
	}

	/**
	 * Set value of CSSD_room
	 * @param cssd_room
	 */
	public final void setCSSD_room(java.lang.Integer cssd_room)
	{
		setCSSD_room(getContext(), cssd_room);
	}

	/**
	 * Set value of CSSD_room
	 * @param context
	 * @param cssd_room
	 */
	public final void setCSSD_room(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer cssd_room)
	{
		getMendixObject().setValue(context, MemberNames.CSSD_room.toString(), cssd_room);
	}

	/**
	 * @return value of Educational_level_KG
	 */
	public final java.lang.Boolean getEducational_level_KG()
	{
		return getEducational_level_KG(getContext());
	}

	/**
	 * @param context
	 * @return value of Educational_level_KG
	 */
	public final java.lang.Boolean getEducational_level_KG(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Educational_level_KG.toString());
	}

	/**
	 * Set value of Educational_level_KG
	 * @param educational_level_kg
	 */
	public final void setEducational_level_KG(java.lang.Boolean educational_level_kg)
	{
		setEducational_level_KG(getContext(), educational_level_kg);
	}

	/**
	 * Set value of Educational_level_KG
	 * @param context
	 * @param educational_level_kg
	 */
	public final void setEducational_level_KG(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean educational_level_kg)
	{
		getMendixObject().setValue(context, MemberNames.Educational_level_KG.toString(), educational_level_kg);
	}

	/**
	 * @return value of Educational_level_Primary
	 */
	public final java.lang.Boolean getEducational_level_Primary()
	{
		return getEducational_level_Primary(getContext());
	}

	/**
	 * @param context
	 * @return value of Educational_level_Primary
	 */
	public final java.lang.Boolean getEducational_level_Primary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Educational_level_Primary.toString());
	}

	/**
	 * Set value of Educational_level_Primary
	 * @param educational_level_primary
	 */
	public final void setEducational_level_Primary(java.lang.Boolean educational_level_primary)
	{
		setEducational_level_Primary(getContext(), educational_level_primary);
	}

	/**
	 * Set value of Educational_level_Primary
	 * @param context
	 * @param educational_level_primary
	 */
	public final void setEducational_level_Primary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean educational_level_primary)
	{
		getMendixObject().setValue(context, MemberNames.Educational_level_Primary.toString(), educational_level_primary);
	}

	/**
	 * @return value of Educational_level_Secondary
	 */
	public final java.lang.Boolean getEducational_level_Secondary()
	{
		return getEducational_level_Secondary(getContext());
	}

	/**
	 * @param context
	 * @return value of Educational_level_Secondary
	 */
	public final java.lang.Boolean getEducational_level_Secondary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Educational_level_Secondary.toString());
	}

	/**
	 * Set value of Educational_level_Secondary
	 * @param educational_level_secondary
	 */
	public final void setEducational_level_Secondary(java.lang.Boolean educational_level_secondary)
	{
		setEducational_level_Secondary(getContext(), educational_level_secondary);
	}

	/**
	 * Set value of Educational_level_Secondary
	 * @param context
	 * @param educational_level_secondary
	 */
	public final void setEducational_level_Secondary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean educational_level_secondary)
	{
		getMendixObject().setValue(context, MemberNames.Educational_level_Secondary.toString(), educational_level_secondary);
	}

	/**
	 * @return value of Educational_level_HighSchool
	 */
	public final java.lang.Boolean getEducational_level_HighSchool()
	{
		return getEducational_level_HighSchool(getContext());
	}

	/**
	 * @param context
	 * @return value of Educational_level_HighSchool
	 */
	public final java.lang.Boolean getEducational_level_HighSchool(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Educational_level_HighSchool.toString());
	}

	/**
	 * Set value of Educational_level_HighSchool
	 * @param educational_level_highschool
	 */
	public final void setEducational_level_HighSchool(java.lang.Boolean educational_level_highschool)
	{
		setEducational_level_HighSchool(getContext(), educational_level_highschool);
	}

	/**
	 * Set value of Educational_level_HighSchool
	 * @param context
	 * @param educational_level_highschool
	 */
	public final void setEducational_level_HighSchool(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean educational_level_highschool)
	{
		getMendixObject().setValue(context, MemberNames.Educational_level_HighSchool.toString(), educational_level_highschool);
	}

	/**
	 * @return value of No_Of_students_male
	 */
	public final java.lang.Integer getNo_Of_students_male()
	{
		return getNo_Of_students_male(getContext());
	}

	/**
	 * @param context
	 * @return value of No_Of_students_male
	 */
	public final java.lang.Integer getNo_Of_students_male(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.No_Of_students_male.toString());
	}

	/**
	 * Set value of No_Of_students_male
	 * @param no_of_students_male
	 */
	public final void setNo_Of_students_male(java.lang.Integer no_of_students_male)
	{
		setNo_Of_students_male(getContext(), no_of_students_male);
	}

	/**
	 * Set value of No_Of_students_male
	 * @param context
	 * @param no_of_students_male
	 */
	public final void setNo_Of_students_male(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer no_of_students_male)
	{
		getMendixObject().setValue(context, MemberNames.No_Of_students_male.toString(), no_of_students_male);
	}

	/**
	 * @return value of No_Of_students_female
	 */
	public final java.lang.Integer getNo_Of_students_female()
	{
		return getNo_Of_students_female(getContext());
	}

	/**
	 * @param context
	 * @return value of No_Of_students_female
	 */
	public final java.lang.Integer getNo_Of_students_female(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.No_Of_students_female.toString());
	}

	/**
	 * Set value of No_Of_students_female
	 * @param no_of_students_female
	 */
	public final void setNo_Of_students_female(java.lang.Integer no_of_students_female)
	{
		setNo_Of_students_female(getContext(), no_of_students_female);
	}

	/**
	 * Set value of No_Of_students_female
	 * @param context
	 * @param no_of_students_female
	 */
	public final void setNo_Of_students_female(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer no_of_students_female)
	{
		getMendixObject().setValue(context, MemberNames.No_Of_students_female.toString(), no_of_students_female);
	}

	/**
	 * @return value of School_clinic_details_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getSchool_clinic_details_Preliminary() throws com.mendix.core.CoreException
	{
		return getSchool_clinic_details_Preliminary(getContext());
	}

	/**
	 * @param context
	 * @return value of School_clinic_details_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getSchool_clinic_details_Preliminary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.School_clinic_details_Preliminary.toString());
		if (identifier != null)
			result = requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary.load(context, identifier);
		return result;
	}

	/**
	 * Set value of School_clinic_details_Preliminary
	 * @param school_clinic_details_preliminary
	 */
	public final void setSchool_clinic_details_Preliminary(requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary school_clinic_details_preliminary)
	{
		setSchool_clinic_details_Preliminary(getContext(), school_clinic_details_preliminary);
	}

	/**
	 * Set value of School_clinic_details_Preliminary
	 * @param context
	 * @param school_clinic_details_preliminary
	 */
	public final void setSchool_clinic_details_Preliminary(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary school_clinic_details_preliminary)
	{
		if (school_clinic_details_preliminary == null)
			getMendixObject().setValue(context, MemberNames.School_clinic_details_Preliminary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.School_clinic_details_Preliminary.toString(), school_clinic_details_preliminary.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return school_clinic_detailsMendixObject;
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
			final requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details that = (requestforpreliminaryregistrationofafacility_hospital.proxies.School_clinic_details) obj;
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
		return "RequestforPreliminaryRegistrationofaFacility_Hospital.School_clinic_details";
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