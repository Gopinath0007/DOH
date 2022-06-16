// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Infant
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject infantMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Infant";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		InfantNameArabic("InfantNameArabic"),
		InfantNameEnglish("InfantNameEnglish"),
		TimeOfBirth("TimeOfBirth"),
		DateOfBirth("DateOfBirth"),
		DateInHijri("DateInHijri"),
		Gender("Gender"),
		InfantMedicalRecord("InfantMedicalRecord"),
		PlaceOfBirth("PlaceOfBirth"),
		BirthCountry("BirthCountry"),
		BirthOrder("BirthOrder"),
		DOB_Letter("DOB_Letter"),
		DOB_ArabicLetter("DOB_ArabicLetter"),
		Hijri_letter("Hijri_letter"),
		Hijri_ArabicLetter("Hijri_ArabicLetter"),
		HijriDate("HijriDate"),
		date("date"),
		PlaceOfDelivery("PlaceOfDelivery"),
		Infant_BirthNotification("MyFirstModule.Infant_BirthNotification");

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

	public Infant(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Infant"));
	}

	protected Infant(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject infantMendixObject)
	{
		if (infantMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Infant", infantMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Infant");

		this.infantMendixObject = infantMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Infant.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Infant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Infant.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Infant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Infant(context, mendixObject);
	}

	public static myfirstmodule.proxies.Infant load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Infant.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Infant> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Infant> result = new java.util.ArrayList<myfirstmodule.proxies.Infant>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Infant" + xpathConstraint))
			result.add(myfirstmodule.proxies.Infant.initialize(context, obj));
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
	 * @return value of InfantNameArabic
	 */
	public final java.lang.String getInfantNameArabic()
	{
		return getInfantNameArabic(getContext());
	}

	/**
	 * @param context
	 * @return value of InfantNameArabic
	 */
	public final java.lang.String getInfantNameArabic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InfantNameArabic.toString());
	}

	/**
	 * Set value of InfantNameArabic
	 * @param infantnamearabic
	 */
	public final void setInfantNameArabic(java.lang.String infantnamearabic)
	{
		setInfantNameArabic(getContext(), infantnamearabic);
	}

	/**
	 * Set value of InfantNameArabic
	 * @param context
	 * @param infantnamearabic
	 */
	public final void setInfantNameArabic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String infantnamearabic)
	{
		getMendixObject().setValue(context, MemberNames.InfantNameArabic.toString(), infantnamearabic);
	}

	/**
	 * @return value of InfantNameEnglish
	 */
	public final java.lang.String getInfantNameEnglish()
	{
		return getInfantNameEnglish(getContext());
	}

	/**
	 * @param context
	 * @return value of InfantNameEnglish
	 */
	public final java.lang.String getInfantNameEnglish(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InfantNameEnglish.toString());
	}

	/**
	 * Set value of InfantNameEnglish
	 * @param infantnameenglish
	 */
	public final void setInfantNameEnglish(java.lang.String infantnameenglish)
	{
		setInfantNameEnglish(getContext(), infantnameenglish);
	}

	/**
	 * Set value of InfantNameEnglish
	 * @param context
	 * @param infantnameenglish
	 */
	public final void setInfantNameEnglish(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String infantnameenglish)
	{
		getMendixObject().setValue(context, MemberNames.InfantNameEnglish.toString(), infantnameenglish);
	}

	/**
	 * @return value of TimeOfBirth
	 */
	public final java.util.Date getTimeOfBirth()
	{
		return getTimeOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeOfBirth
	 */
	public final java.util.Date getTimeOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeOfBirth.toString());
	}

	/**
	 * Set value of TimeOfBirth
	 * @param timeofbirth
	 */
	public final void setTimeOfBirth(java.util.Date timeofbirth)
	{
		setTimeOfBirth(getContext(), timeofbirth);
	}

	/**
	 * Set value of TimeOfBirth
	 * @param context
	 * @param timeofbirth
	 */
	public final void setTimeOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timeofbirth)
	{
		getMendixObject().setValue(context, MemberNames.TimeOfBirth.toString(), timeofbirth);
	}

	/**
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth()
	{
		return getDateOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfBirth.toString());
	}

	/**
	 * Set value of DateOfBirth
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(java.util.Date dateofbirth)
	{
		setDateOfBirth(getContext(), dateofbirth);
	}

	/**
	 * Set value of DateOfBirth
	 * @param context
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.DateOfBirth.toString(), dateofbirth);
	}

	/**
	 * @return value of DateInHijri
	 */
	public final java.lang.String getDateInHijri()
	{
		return getDateInHijri(getContext());
	}

	/**
	 * @param context
	 * @return value of DateInHijri
	 */
	public final java.lang.String getDateInHijri(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DateInHijri.toString());
	}

	/**
	 * Set value of DateInHijri
	 * @param dateinhijri
	 */
	public final void setDateInHijri(java.lang.String dateinhijri)
	{
		setDateInHijri(getContext(), dateinhijri);
	}

	/**
	 * Set value of DateInHijri
	 * @param context
	 * @param dateinhijri
	 */
	public final void setDateInHijri(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dateinhijri)
	{
		getMendixObject().setValue(context, MemberNames.DateInHijri.toString(), dateinhijri);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final myfirstmodule.proxies.EnumGender getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final myfirstmodule.proxies.EnumGender getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.EnumGender.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(myfirstmodule.proxies.EnumGender gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.EnumGender gender)
	{
		if (gender != null)
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		else
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
	}

	/**
	 * @return value of InfantMedicalRecord
	 */
	public final java.lang.String getInfantMedicalRecord()
	{
		return getInfantMedicalRecord(getContext());
	}

	/**
	 * @param context
	 * @return value of InfantMedicalRecord
	 */
	public final java.lang.String getInfantMedicalRecord(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InfantMedicalRecord.toString());
	}

	/**
	 * Set value of InfantMedicalRecord
	 * @param infantmedicalrecord
	 */
	public final void setInfantMedicalRecord(java.lang.String infantmedicalrecord)
	{
		setInfantMedicalRecord(getContext(), infantmedicalrecord);
	}

	/**
	 * Set value of InfantMedicalRecord
	 * @param context
	 * @param infantmedicalrecord
	 */
	public final void setInfantMedicalRecord(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String infantmedicalrecord)
	{
		getMendixObject().setValue(context, MemberNames.InfantMedicalRecord.toString(), infantmedicalrecord);
	}

	/**
	 * @return value of PlaceOfBirth
	 */
	public final java.lang.String getPlaceOfBirth()
	{
		return getPlaceOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of PlaceOfBirth
	 */
	public final java.lang.String getPlaceOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlaceOfBirth.toString());
	}

	/**
	 * Set value of PlaceOfBirth
	 * @param placeofbirth
	 */
	public final void setPlaceOfBirth(java.lang.String placeofbirth)
	{
		setPlaceOfBirth(getContext(), placeofbirth);
	}

	/**
	 * Set value of PlaceOfBirth
	 * @param context
	 * @param placeofbirth
	 */
	public final void setPlaceOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String placeofbirth)
	{
		getMendixObject().setValue(context, MemberNames.PlaceOfBirth.toString(), placeofbirth);
	}

	/**
	 * Set value of BirthCountry
	 * @param birthcountry
	 */
	public final countriesv5.proxies.Countries getBirthCountry()
	{
		return getBirthCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of BirthCountry
	 */
	public final countriesv5.proxies.Countries getBirthCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BirthCountry.toString());
		if (obj == null)
			return null;

		return countriesv5.proxies.Countries.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BirthCountry
	 * @param birthcountry
	 */
	public final void setBirthCountry(countriesv5.proxies.Countries birthcountry)
	{
		setBirthCountry(getContext(), birthcountry);
	}

	/**
	 * Set value of BirthCountry
	 * @param context
	 * @param birthcountry
	 */
	public final void setBirthCountry(com.mendix.systemwideinterfaces.core.IContext context, countriesv5.proxies.Countries birthcountry)
	{
		if (birthcountry != null)
			getMendixObject().setValue(context, MemberNames.BirthCountry.toString(), birthcountry.toString());
		else
			getMendixObject().setValue(context, MemberNames.BirthCountry.toString(), null);
	}

	/**
	 * @return value of BirthOrder
	 */
	public final java.lang.Integer getBirthOrder()
	{
		return getBirthOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of BirthOrder
	 */
	public final java.lang.Integer getBirthOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BirthOrder.toString());
	}

	/**
	 * Set value of BirthOrder
	 * @param birthorder
	 */
	public final void setBirthOrder(java.lang.Integer birthorder)
	{
		setBirthOrder(getContext(), birthorder);
	}

	/**
	 * Set value of BirthOrder
	 * @param context
	 * @param birthorder
	 */
	public final void setBirthOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer birthorder)
	{
		getMendixObject().setValue(context, MemberNames.BirthOrder.toString(), birthorder);
	}

	/**
	 * @return value of DOB_Letter
	 */
	public final java.lang.String getDOB_Letter()
	{
		return getDOB_Letter(getContext());
	}

	/**
	 * @param context
	 * @return value of DOB_Letter
	 */
	public final java.lang.String getDOB_Letter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DOB_Letter.toString());
	}

	/**
	 * Set value of DOB_Letter
	 * @param dob_letter
	 */
	public final void setDOB_Letter(java.lang.String dob_letter)
	{
		setDOB_Letter(getContext(), dob_letter);
	}

	/**
	 * Set value of DOB_Letter
	 * @param context
	 * @param dob_letter
	 */
	public final void setDOB_Letter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dob_letter)
	{
		getMendixObject().setValue(context, MemberNames.DOB_Letter.toString(), dob_letter);
	}

	/**
	 * @return value of DOB_ArabicLetter
	 */
	public final java.lang.String getDOB_ArabicLetter()
	{
		return getDOB_ArabicLetter(getContext());
	}

	/**
	 * @param context
	 * @return value of DOB_ArabicLetter
	 */
	public final java.lang.String getDOB_ArabicLetter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DOB_ArabicLetter.toString());
	}

	/**
	 * Set value of DOB_ArabicLetter
	 * @param dob_arabicletter
	 */
	public final void setDOB_ArabicLetter(java.lang.String dob_arabicletter)
	{
		setDOB_ArabicLetter(getContext(), dob_arabicletter);
	}

	/**
	 * Set value of DOB_ArabicLetter
	 * @param context
	 * @param dob_arabicletter
	 */
	public final void setDOB_ArabicLetter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dob_arabicletter)
	{
		getMendixObject().setValue(context, MemberNames.DOB_ArabicLetter.toString(), dob_arabicletter);
	}

	/**
	 * @return value of Hijri_letter
	 */
	public final java.lang.String getHijri_letter()
	{
		return getHijri_letter(getContext());
	}

	/**
	 * @param context
	 * @return value of Hijri_letter
	 */
	public final java.lang.String getHijri_letter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Hijri_letter.toString());
	}

	/**
	 * Set value of Hijri_letter
	 * @param hijri_letter
	 */
	public final void setHijri_letter(java.lang.String hijri_letter)
	{
		setHijri_letter(getContext(), hijri_letter);
	}

	/**
	 * Set value of Hijri_letter
	 * @param context
	 * @param hijri_letter
	 */
	public final void setHijri_letter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hijri_letter)
	{
		getMendixObject().setValue(context, MemberNames.Hijri_letter.toString(), hijri_letter);
	}

	/**
	 * @return value of Hijri_ArabicLetter
	 */
	public final java.lang.String getHijri_ArabicLetter()
	{
		return getHijri_ArabicLetter(getContext());
	}

	/**
	 * @param context
	 * @return value of Hijri_ArabicLetter
	 */
	public final java.lang.String getHijri_ArabicLetter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Hijri_ArabicLetter.toString());
	}

	/**
	 * Set value of Hijri_ArabicLetter
	 * @param hijri_arabicletter
	 */
	public final void setHijri_ArabicLetter(java.lang.String hijri_arabicletter)
	{
		setHijri_ArabicLetter(getContext(), hijri_arabicletter);
	}

	/**
	 * Set value of Hijri_ArabicLetter
	 * @param context
	 * @param hijri_arabicletter
	 */
	public final void setHijri_ArabicLetter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hijri_arabicletter)
	{
		getMendixObject().setValue(context, MemberNames.Hijri_ArabicLetter.toString(), hijri_arabicletter);
	}

	/**
	 * @return value of HijriDate
	 */
	public final java.util.Date getHijriDate()
	{
		return getHijriDate(getContext());
	}

	/**
	 * @param context
	 * @return value of HijriDate
	 */
	public final java.util.Date getHijriDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.HijriDate.toString());
	}

	/**
	 * Set value of HijriDate
	 * @param hijridate
	 */
	public final void setHijriDate(java.util.Date hijridate)
	{
		setHijriDate(getContext(), hijridate);
	}

	/**
	 * Set value of HijriDate
	 * @param context
	 * @param hijridate
	 */
	public final void setHijriDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date hijridate)
	{
		getMendixObject().setValue(context, MemberNames.HijriDate.toString(), hijridate);
	}

	/**
	 * @return value of date
	 */
	public final java.lang.Boolean getdate()
	{
		return getdate(getContext());
	}

	/**
	 * @param context
	 * @return value of date
	 */
	public final java.lang.Boolean getdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.date.toString());
	}

	/**
	 * Set value of date
	 * @param date
	 */
	public final void setdate(java.lang.Boolean date)
	{
		setdate(getContext(), date);
	}

	/**
	 * Set value of date
	 * @param context
	 * @param date
	 */
	public final void setdate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean date)
	{
		getMendixObject().setValue(context, MemberNames.date.toString(), date);
	}

	/**
	 * @return value of PlaceOfDelivery
	 */
	public final java.lang.String getPlaceOfDelivery()
	{
		return getPlaceOfDelivery(getContext());
	}

	/**
	 * @param context
	 * @return value of PlaceOfDelivery
	 */
	public final java.lang.String getPlaceOfDelivery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlaceOfDelivery.toString());
	}

	/**
	 * Set value of PlaceOfDelivery
	 * @param placeofdelivery
	 */
	public final void setPlaceOfDelivery(java.lang.String placeofdelivery)
	{
		setPlaceOfDelivery(getContext(), placeofdelivery);
	}

	/**
	 * Set value of PlaceOfDelivery
	 * @param context
	 * @param placeofdelivery
	 */
	public final void setPlaceOfDelivery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String placeofdelivery)
	{
		getMendixObject().setValue(context, MemberNames.PlaceOfDelivery.toString(), placeofdelivery);
	}

	/**
	 * @return value of Infant_BirthNotification
	 */
	public final myfirstmodule.proxies.BirthNotification getInfant_BirthNotification() throws com.mendix.core.CoreException
	{
		return getInfant_BirthNotification(getContext());
	}

	/**
	 * @param context
	 * @return value of Infant_BirthNotification
	 */
	public final myfirstmodule.proxies.BirthNotification getInfant_BirthNotification(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.BirthNotification result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infant_BirthNotification.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.BirthNotification.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infant_BirthNotification
	 * @param infant_birthnotification
	 */
	public final void setInfant_BirthNotification(myfirstmodule.proxies.BirthNotification infant_birthnotification)
	{
		setInfant_BirthNotification(getContext(), infant_birthnotification);
	}

	/**
	 * Set value of Infant_BirthNotification
	 * @param context
	 * @param infant_birthnotification
	 */
	public final void setInfant_BirthNotification(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.BirthNotification infant_birthnotification)
	{
		if (infant_birthnotification == null)
			getMendixObject().setValue(context, MemberNames.Infant_BirthNotification.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infant_BirthNotification.toString(), infant_birthnotification.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return infantMendixObject;
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
			final myfirstmodule.proxies.Infant that = (myfirstmodule.proxies.Infant) obj;
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
		return "MyFirstModule.Infant";
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
