// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public class Specialiti
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject specialitiMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name_("Name_");

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

	public Specialiti(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti"));
	}

	protected Specialiti(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject specialitiMendixObject)
	{
		if (specialitiMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti", specialitiMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti");

		this.specialitiMendixObject = specialitiMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Specialiti.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti(context, mendixObject);
	}

	public static requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti.initialize(context, mendixObject);
	}

	public static java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti> result = new java.util.ArrayList<requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti" + xpathConstraint))
			result.add(requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti.initialize(context, obj));
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
	 * @return value of Name_
	 */
	public final java.lang.String getName_()
	{
		return getName_(getContext());
	}

	/**
	 * @param context
	 * @return value of Name_
	 */
	public final java.lang.String getName_(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name_.toString());
	}

	/**
	 * Set value of Name_
	 * @param name_
	 */
	public final void setName_(java.lang.String name_)
	{
		setName_(getContext(), name_);
	}

	/**
	 * Set value of Name_
	 * @param context
	 * @param name_
	 */
	public final void setName_(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name_)
	{
		getMendixObject().setValue(context, MemberNames.Name_.toString(), name_);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return specialitiMendixObject;
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
			final requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti that = (requestforpreliminaryregistrationofafacility_hospital.proxies.Specialiti) obj;
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
		return "RequestforPreliminaryRegistrationofaFacility_Hospital.Specialiti";
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
