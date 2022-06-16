// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package consumeemiratesservices.proxies;

public class JsonObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject jsonObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ConsumeEmiratesServices.JsonObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EmiratesId("EmiratesId"),
		EnglishFullName("EnglishFullName"),
		ArabicFullName("ArabicFullName"),
		Nationality("Nationality"),
		Religion("Religion"),
		MartialStatus("MartialStatus"),
		JsonObject_Root("ConsumeEmiratesServices.JsonObject_Root");

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

	public JsonObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ConsumeEmiratesServices.JsonObject"));
	}

	protected JsonObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject jsonObjectMendixObject)
	{
		if (jsonObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ConsumeEmiratesServices.JsonObject", jsonObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ConsumeEmiratesServices.JsonObject");

		this.jsonObjectMendixObject = jsonObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'JsonObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static consumeemiratesservices.proxies.JsonObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return consumeemiratesservices.proxies.JsonObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static consumeemiratesservices.proxies.JsonObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new consumeemiratesservices.proxies.JsonObject(context, mendixObject);
	}

	public static consumeemiratesservices.proxies.JsonObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return consumeemiratesservices.proxies.JsonObject.initialize(context, mendixObject);
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
	 * @return value of EmiratesId
	 */
	public final java.lang.String getEmiratesId()
	{
		return getEmiratesId(getContext());
	}

	/**
	 * @param context
	 * @return value of EmiratesId
	 */
	public final java.lang.String getEmiratesId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmiratesId.toString());
	}

	/**
	 * Set value of EmiratesId
	 * @param emiratesid
	 */
	public final void setEmiratesId(java.lang.String emiratesid)
	{
		setEmiratesId(getContext(), emiratesid);
	}

	/**
	 * Set value of EmiratesId
	 * @param context
	 * @param emiratesid
	 */
	public final void setEmiratesId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emiratesid)
	{
		getMendixObject().setValue(context, MemberNames.EmiratesId.toString(), emiratesid);
	}

	/**
	 * @return value of EnglishFullName
	 */
	public final java.lang.String getEnglishFullName()
	{
		return getEnglishFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of EnglishFullName
	 */
	public final java.lang.String getEnglishFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EnglishFullName.toString());
	}

	/**
	 * Set value of EnglishFullName
	 * @param englishfullname
	 */
	public final void setEnglishFullName(java.lang.String englishfullname)
	{
		setEnglishFullName(getContext(), englishfullname);
	}

	/**
	 * Set value of EnglishFullName
	 * @param context
	 * @param englishfullname
	 */
	public final void setEnglishFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String englishfullname)
	{
		getMendixObject().setValue(context, MemberNames.EnglishFullName.toString(), englishfullname);
	}

	/**
	 * @return value of ArabicFullName
	 */
	public final java.lang.String getArabicFullName()
	{
		return getArabicFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of ArabicFullName
	 */
	public final java.lang.String getArabicFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ArabicFullName.toString());
	}

	/**
	 * Set value of ArabicFullName
	 * @param arabicfullname
	 */
	public final void setArabicFullName(java.lang.String arabicfullname)
	{
		setArabicFullName(getContext(), arabicfullname);
	}

	/**
	 * Set value of ArabicFullName
	 * @param context
	 * @param arabicfullname
	 */
	public final void setArabicFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String arabicfullname)
	{
		getMendixObject().setValue(context, MemberNames.ArabicFullName.toString(), arabicfullname);
	}

	/**
	 * @return value of Nationality
	 */
	public final java.lang.String getNationality()
	{
		return getNationality(getContext());
	}

	/**
	 * @param context
	 * @return value of Nationality
	 */
	public final java.lang.String getNationality(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nationality.toString());
	}

	/**
	 * Set value of Nationality
	 * @param nationality
	 */
	public final void setNationality(java.lang.String nationality)
	{
		setNationality(getContext(), nationality);
	}

	/**
	 * Set value of Nationality
	 * @param context
	 * @param nationality
	 */
	public final void setNationality(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nationality)
	{
		getMendixObject().setValue(context, MemberNames.Nationality.toString(), nationality);
	}

	/**
	 * @return value of Religion
	 */
	public final java.lang.String getReligion()
	{
		return getReligion(getContext());
	}

	/**
	 * @param context
	 * @return value of Religion
	 */
	public final java.lang.String getReligion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Religion.toString());
	}

	/**
	 * Set value of Religion
	 * @param religion
	 */
	public final void setReligion(java.lang.String religion)
	{
		setReligion(getContext(), religion);
	}

	/**
	 * Set value of Religion
	 * @param context
	 * @param religion
	 */
	public final void setReligion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String religion)
	{
		getMendixObject().setValue(context, MemberNames.Religion.toString(), religion);
	}

	/**
	 * @return value of MartialStatus
	 */
	public final java.lang.String getMartialStatus()
	{
		return getMartialStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of MartialStatus
	 */
	public final java.lang.String getMartialStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MartialStatus.toString());
	}

	/**
	 * Set value of MartialStatus
	 * @param martialstatus
	 */
	public final void setMartialStatus(java.lang.String martialstatus)
	{
		setMartialStatus(getContext(), martialstatus);
	}

	/**
	 * Set value of MartialStatus
	 * @param context
	 * @param martialstatus
	 */
	public final void setMartialStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String martialstatus)
	{
		getMendixObject().setValue(context, MemberNames.MartialStatus.toString(), martialstatus);
	}

	/**
	 * @return value of JsonObject_Root
	 */
	public final consumeemiratesservices.proxies.Root getJsonObject_Root() throws com.mendix.core.CoreException
	{
		return getJsonObject_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of JsonObject_Root
	 */
	public final consumeemiratesservices.proxies.Root getJsonObject_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		consumeemiratesservices.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.JsonObject_Root.toString());
		if (identifier != null)
			result = consumeemiratesservices.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of JsonObject_Root
	 * @param jsonobject_root
	 */
	public final void setJsonObject_Root(consumeemiratesservices.proxies.Root jsonobject_root)
	{
		setJsonObject_Root(getContext(), jsonobject_root);
	}

	/**
	 * Set value of JsonObject_Root
	 * @param context
	 * @param jsonobject_root
	 */
	public final void setJsonObject_Root(com.mendix.systemwideinterfaces.core.IContext context, consumeemiratesservices.proxies.Root jsonobject_root)
	{
		if (jsonobject_root == null)
			getMendixObject().setValue(context, MemberNames.JsonObject_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.JsonObject_Root.toString(), jsonobject_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return jsonObjectMendixObject;
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
			final consumeemiratesservices.proxies.JsonObject that = (consumeemiratesservices.proxies.JsonObject) obj;
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
		return "ConsumeEmiratesServices.JsonObject";
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
