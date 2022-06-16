// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ded_sevice.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DED_sevice module
	public static ded_sevice.proxies.DED getGET_DED(IContext context, system.proxies.HttpRequest _httpRequest, system.proxies.HttpResponse _httpResponse, java.lang.String _dED_no)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
		params.put("httpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
		params.put("DED_no", _dED_no);
		IMendixObject result = (IMendixObject)Core.microflowCall("DED_sevice.GetGET_DED").withParams(params).execute(context);
		return result == null ? null : ded_sevice.proxies.DED.initialize(context, result);
	}
}