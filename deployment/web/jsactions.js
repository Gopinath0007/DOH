define(["big.js"], (__WEBPACK_EXTERNAL_MODULE_big_js__) => { return /******/ (() => { // webpackBootstrap
/******/ 	"use strict";
/******/ 	var __webpack_modules__ = ({

/***/ "../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/myfirstmodule/actions/JavaScript_action.js":
/*!********************************************************************************************************************************************!*\
  !*** ../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/myfirstmodule/actions/JavaScript_action.js ***!
  \********************************************************************************************************************************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "JavaScript_action": () => (/* binding */ JavaScript_action)
/* harmony export */ });
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! big.js */ "big.js");
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(big_js__WEBPACK_IMPORTED_MODULE_0__);
// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
 // BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {Big} number
 * @returns {Promise.<string>}
 */

async function JavaScript_action(number) {
  // BEGIN USER CODE
  const first = ['', 'one ', 'two ', 'three ', 'four ', 'five ', 'six ', 'seven ', 'eight ', 'nine ', 'ten ', 'eleven ', 'twelve ', 'thirteen ', 'fourteen ', 'fifteen ', 'sixteen ', 'seventeen ', 'eighteen ', 'nineteen '];
  const tens = ['', '', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety'];
  const mad = ['', 'thousand', 'million', 'billion', 'trillion'];
  let word = '';

  for (let i = 0; i < mad.length; i++) {
    let tempNumber = number % (100 * Math.pow(1000, i));

    if (Math.floor(tempNumber / Math.pow(1000, i)) !== 0) {
      if (Math.floor(tempNumber / Math.pow(1000, i)) < 20) {
        word = first[Math.floor(tempNumber / Math.pow(1000, i))] + mad[i] + ' ' + word;
      } else {
        word = tens[Math.floor(tempNumber / (10 * Math.pow(1000, i)))] + '-' + first[Math.floor(tempNumber / Math.pow(1000, i)) % 10] + mad[i] + ' ' + word;
      }
    }

    tempNumber = number % Math.pow(1000, i + 1);
    if (Math.floor(tempNumber / (100 * Math.pow(1000, i))) !== 0) word = first[Math.floor(tempNumber / (100 * Math.pow(1000, i)))] + 'hundred ' + word;
  }

  return word; // END USER CODE
}

/***/ }),

/***/ "../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/nanoflowcommons/actions/RefreshObject.js":
/*!******************************************************************************************************************************************!*\
  !*** ../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/nanoflowcommons/actions/RefreshObject.js ***!
  \******************************************************************************************************************************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "RefreshObject": () => (/* binding */ RefreshObject)
/* harmony export */ });
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! big.js */ "big.js");
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(big_js__WEBPACK_IMPORTED_MODULE_0__);
// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
 // BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Updates an entity object without needing to refresh the whole page via passing an entity object.
 * @param {MxObject} objectToRefresh - Object which will be refreshed.
 * @returns {Promise.<void>}
 */

async function RefreshObject(objectToRefresh) {
  // BEGIN USER CODE
  if (!objectToRefresh) {
    return Promise.reject(new Error("ObjectToRefresh parameter is required"));
  }

  return new Promise(resolve => {
    mx.data.update({
      guid: objectToRefresh.getGuid(),
      callback: () => resolve(true)
    });
  }); // END USER CODE
}

/***/ }),

/***/ "big.js":
/*!*************************!*\
  !*** external "big.js" ***!
  \*************************/
/***/ ((module) => {

module.exports = __WEBPACK_EXTERNAL_MODULE_big_js__;

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	// The module cache
/******/ 	var __webpack_module_cache__ = {};
/******/ 	
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/ 		// Check if module is in cache
/******/ 		var cachedModule = __webpack_module_cache__[moduleId];
/******/ 		if (cachedModule !== undefined) {
/******/ 			return cachedModule.exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = __webpack_module_cache__[moduleId] = {
/******/ 			// no module.id needed
/******/ 			// no module.loaded needed
/******/ 			exports: {}
/******/ 		};
/******/ 	
/******/ 		// Execute the module function
/******/ 		__webpack_modules__[moduleId](module, module.exports, __webpack_require__);
/******/ 	
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/ 	
/************************************************************************/
/******/ 	/* webpack/runtime/compat get default export */
/******/ 	(() => {
/******/ 		// getDefaultExport function for compatibility with non-harmony modules
/******/ 		__webpack_require__.n = (module) => {
/******/ 			var getter = module && module.__esModule ?
/******/ 				() => (module['default']) :
/******/ 				() => (module);
/******/ 			__webpack_require__.d(getter, { a: getter });
/******/ 			return getter;
/******/ 		};
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/define property getters */
/******/ 	(() => {
/******/ 		// define getter functions for harmony exports
/******/ 		__webpack_require__.d = (exports, definition) => {
/******/ 			for(var key in definition) {
/******/ 				if(__webpack_require__.o(definition, key) && !__webpack_require__.o(exports, key)) {
/******/ 					Object.defineProperty(exports, key, { enumerable: true, get: definition[key] });
/******/ 				}
/******/ 			}
/******/ 		};
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/hasOwnProperty shorthand */
/******/ 	(() => {
/******/ 		__webpack_require__.o = (obj, prop) => (Object.prototype.hasOwnProperty.call(obj, prop))
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/make namespace object */
/******/ 	(() => {
/******/ 		// define __esModule on exports
/******/ 		__webpack_require__.r = (exports) => {
/******/ 			if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 				Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 			}
/******/ 			Object.defineProperty(exports, '__esModule', { value: true });
/******/ 		};
/******/ 	})();
/******/ 	
/************************************************************************/
var __webpack_exports__ = {};
// This entry need to be wrapped in an IIFE because it need to be isolated against other modules in the chunk.
(() => {
/*!************************************************************************************************************!*\
  !*** ../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/deployment/tmp/jsactions.js ***!
  \************************************************************************************************************/
__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "NanoflowCommons$RefreshObject": () => (/* binding */ NanoflowCommons$RefreshObject),
/* harmony export */   "MyFirstModule$JavaScript_action": () => (/* binding */ MyFirstModule$JavaScript_action)
/* harmony export */ });
const NanoflowCommons$RefreshObject = async () => (await Promise.resolve(/*! import() */).then(__webpack_require__.bind(__webpack_require__, /*! ../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/nanoflowcommons/actions/RefreshObject */ "../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/nanoflowcommons/actions/RefreshObject.js"))).RefreshObject;
const MyFirstModule$JavaScript_action = async () => (await Promise.resolve(/*! import() */).then(__webpack_require__.bind(__webpack_require__, /*! ../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/myfirstmodule/actions/JavaScript_action */ "../../../../../../Users/gopin/Documents/Mendix/Department Of Health-main/javascriptsource/myfirstmodule/actions/JavaScript_action.js"))).JavaScript_action;
})();

/******/ 	return __webpack_exports__;
/******/ })()
;
});;
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoianNhY3Rpb25zLmpzIiwibWFwcGluZ3MiOiI7Ozs7Ozs7Ozs7Ozs7Ozs7QUFBQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDQTtDQUdBO0FBQ0E7O0FBRUE7QUFDQTtBQUNBO0FBQ0E7O0FBQ08sZUFBZUMsaUJBQWYsQ0FBaUNDLE1BQWpDLEVBQXlDO0FBQy9DO0FBRUMsUUFBTUMsS0FBSyxHQUFHLENBQUMsRUFBRCxFQUFJLE1BQUosRUFBVyxNQUFYLEVBQWtCLFFBQWxCLEVBQTJCLE9BQTNCLEVBQW9DLE9BQXBDLEVBQTRDLE1BQTVDLEVBQW1ELFFBQW5ELEVBQTRELFFBQTVELEVBQXFFLE9BQXJFLEVBQTZFLE1BQTdFLEVBQW9GLFNBQXBGLEVBQThGLFNBQTlGLEVBQXdHLFdBQXhHLEVBQW9ILFdBQXBILEVBQWdJLFVBQWhJLEVBQTJJLFVBQTNJLEVBQXNKLFlBQXRKLEVBQW1LLFdBQW5LLEVBQStLLFdBQS9LLENBQWQ7QUFDQSxRQUFNQyxJQUFJLEdBQUcsQ0FBQyxFQUFELEVBQUssRUFBTCxFQUFTLFFBQVQsRUFBa0IsUUFBbEIsRUFBMkIsT0FBM0IsRUFBbUMsT0FBbkMsRUFBNEMsT0FBNUMsRUFBb0QsU0FBcEQsRUFBOEQsUUFBOUQsRUFBdUUsUUFBdkUsQ0FBYjtBQUNBLFFBQU1DLEdBQUcsR0FBRyxDQUFDLEVBQUQsRUFBSyxVQUFMLEVBQWlCLFNBQWpCLEVBQTRCLFNBQTVCLEVBQXVDLFVBQXZDLENBQVo7QUFDQSxNQUFJQyxJQUFJLEdBQUcsRUFBWDs7QUFFQSxPQUFLLElBQUlDLENBQUMsR0FBRyxDQUFiLEVBQWdCQSxDQUFDLEdBQUdGLEdBQUcsQ0FBQ0csTUFBeEIsRUFBZ0NELENBQUMsRUFBakMsRUFBcUM7QUFDbkMsUUFBSUUsVUFBVSxHQUFHUCxNQUFNLElBQUUsTUFBSVEsSUFBSSxDQUFDQyxHQUFMLENBQVMsSUFBVCxFQUFjSixDQUFkLENBQU4sQ0FBdkI7O0FBQ0EsUUFBSUcsSUFBSSxDQUFDRSxLQUFMLENBQVdILFVBQVUsR0FBQ0MsSUFBSSxDQUFDQyxHQUFMLENBQVMsSUFBVCxFQUFjSixDQUFkLENBQXRCLE1BQTRDLENBQWhELEVBQW1EO0FBQ2pELFVBQUlHLElBQUksQ0FBQ0UsS0FBTCxDQUFXSCxVQUFVLEdBQUNDLElBQUksQ0FBQ0MsR0FBTCxDQUFTLElBQVQsRUFBY0osQ0FBZCxDQUF0QixJQUEwQyxFQUE5QyxFQUFrRDtBQUNoREQsUUFBQUEsSUFBSSxHQUFHSCxLQUFLLENBQUNPLElBQUksQ0FBQ0UsS0FBTCxDQUFXSCxVQUFVLEdBQUNDLElBQUksQ0FBQ0MsR0FBTCxDQUFTLElBQVQsRUFBY0osQ0FBZCxDQUF0QixDQUFELENBQUwsR0FBaURGLEdBQUcsQ0FBQ0UsQ0FBRCxDQUFwRCxHQUEwRCxHQUExRCxHQUFnRUQsSUFBdkU7QUFDRCxPQUZELE1BRU87QUFDTEEsUUFBQUEsSUFBSSxHQUFHRixJQUFJLENBQUNNLElBQUksQ0FBQ0UsS0FBTCxDQUFXSCxVQUFVLElBQUUsS0FBR0MsSUFBSSxDQUFDQyxHQUFMLENBQVMsSUFBVCxFQUFjSixDQUFkLENBQUwsQ0FBckIsQ0FBRCxDQUFKLEdBQXFELEdBQXJELEdBQTJESixLQUFLLENBQUNPLElBQUksQ0FBQ0UsS0FBTCxDQUFXSCxVQUFVLEdBQUNDLElBQUksQ0FBQ0MsR0FBTCxDQUFTLElBQVQsRUFBY0osQ0FBZCxDQUF0QixJQUF3QyxFQUF6QyxDQUFoRSxHQUErR0YsR0FBRyxDQUFDRSxDQUFELENBQWxILEdBQXdILEdBQXhILEdBQThIRCxJQUFySTtBQUNEO0FBQ0Y7O0FBRURHLElBQUFBLFVBQVUsR0FBR1AsTUFBTSxHQUFFUSxJQUFJLENBQUNDLEdBQUwsQ0FBUyxJQUFULEVBQWNKLENBQUMsR0FBQyxDQUFoQixDQUFyQjtBQUNBLFFBQUlHLElBQUksQ0FBQ0UsS0FBTCxDQUFXSCxVQUFVLElBQUUsTUFBSUMsSUFBSSxDQUFDQyxHQUFMLENBQVMsSUFBVCxFQUFjSixDQUFkLENBQU4sQ0FBckIsTUFBa0QsQ0FBdEQsRUFBeURELElBQUksR0FBR0gsS0FBSyxDQUFDTyxJQUFJLENBQUNFLEtBQUwsQ0FBV0gsVUFBVSxJQUFFLE1BQUlDLElBQUksQ0FBQ0MsR0FBTCxDQUFTLElBQVQsRUFBY0osQ0FBZCxDQUFOLENBQXJCLENBQUQsQ0FBTCxHQUF1RCxVQUF2RCxHQUFvRUQsSUFBM0U7QUFDMUQ7O0FBQ0MsU0FBT0EsSUFBUCxDQXJCNEMsQ0F1Qi9DO0FBQ0E7Ozs7Ozs7Ozs7Ozs7Ozs7QUN4Q0Q7QUFDQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7Q0FHQTtBQUNBOztBQUVBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7O0FBQ08sZUFBZU8sYUFBZixDQUE2QkMsZUFBN0IsRUFBOEM7QUFDcEQ7QUFDRyxNQUFJLENBQUNBLGVBQUwsRUFBc0I7QUFDbEIsV0FBT0MsT0FBTyxDQUFDQyxNQUFSLENBQWUsSUFBSUMsS0FBSixDQUFVLHVDQUFWLENBQWYsQ0FBUDtBQUNIOztBQUNELFNBQU8sSUFBSUYsT0FBSixDQUFZRyxPQUFPLElBQUk7QUFDMUJDLElBQUFBLEVBQUUsQ0FBQ0MsSUFBSCxDQUFRQyxNQUFSLENBQWU7QUFDWEMsTUFBQUEsSUFBSSxFQUFFUixlQUFlLENBQUNTLE9BQWhCLEVBREs7QUFFWEMsTUFBQUEsUUFBUSxFQUFFLE1BQU1OLE9BQU8sQ0FBQyxJQUFEO0FBRlosS0FBZjtBQUlILEdBTE0sQ0FBUCxDQUxpRCxDQVdwRDtBQUNBOzs7Ozs7Ozs7O0FDN0JEOzs7Ozs7VUNBQTtVQUNBOztVQUVBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBOztVQUVBO1VBQ0E7O1VBRUE7VUFDQTtVQUNBOzs7OztXQ3RCQTtXQUNBO1dBQ0E7V0FDQTtXQUNBO1dBQ0EsaUNBQWlDLFdBQVc7V0FDNUM7V0FDQTs7Ozs7V0NQQTtXQUNBO1dBQ0E7V0FDQTtXQUNBLHlDQUF5Qyx3Q0FBd0M7V0FDakY7V0FDQTtXQUNBOzs7OztXQ1BBOzs7OztXQ0FBO1dBQ0E7V0FDQTtXQUNBLHVEQUF1RCxpQkFBaUI7V0FDeEU7V0FDQSxnREFBZ0QsYUFBYTtXQUM3RDs7Ozs7Ozs7Ozs7Ozs7O0FDTk8sTUFBTU8sNkJBQTZCLEdBQUcsWUFBWSxDQUFDLE1BQU0saVdBQVAsRUFBbUlaLGFBQXJMO0FBQ0EsTUFBTWEsK0JBQStCLEdBQUcsWUFBWSxDQUFDLE1BQU0scVdBQVAsRUFBcUl6QixpQkFBekwsQyIsInNvdXJjZXMiOlsid2VicGFjazovLy8uLi8uLi8uLi8uLi8uLi8uLi9Vc2Vycy9nb3Bpbi9Eb2N1bWVudHMvTWVuZGl4L0RlcGFydG1lbnQgT2YgSGVhbHRoLW1haW4vamF2YXNjcmlwdHNvdXJjZS9teWZpcnN0bW9kdWxlL2FjdGlvbnMvSmF2YVNjcmlwdF9hY3Rpb24uanMiLCJ3ZWJwYWNrOi8vLy4uLy4uLy4uLy4uLy4uLy4uL1VzZXJzL2dvcGluL0RvY3VtZW50cy9NZW5kaXgvRGVwYXJ0bWVudCBPZiBIZWFsdGgtbWFpbi9qYXZhc2NyaXB0c291cmNlL25hbm9mbG93Y29tbW9ucy9hY3Rpb25zL1JlZnJlc2hPYmplY3QuanMiLCJ3ZWJwYWNrOi8vL2V4dGVybmFsIGFtZCBcImJpZy5qc1wiIiwid2VicGFjazovLy93ZWJwYWNrL2Jvb3RzdHJhcCIsIndlYnBhY2s6Ly8vd2VicGFjay9ydW50aW1lL2NvbXBhdCBnZXQgZGVmYXVsdCBleHBvcnQiLCJ3ZWJwYWNrOi8vL3dlYnBhY2svcnVudGltZS9kZWZpbmUgcHJvcGVydHkgZ2V0dGVycyIsIndlYnBhY2s6Ly8vd2VicGFjay9ydW50aW1lL2hhc093blByb3BlcnR5IHNob3J0aGFuZCIsIndlYnBhY2s6Ly8vd2VicGFjay9ydW50aW1lL21ha2UgbmFtZXNwYWNlIG9iamVjdCIsIndlYnBhY2s6Ly8vLi4vLi4vLi4vLi4vLi4vLi4vVXNlcnMvZ29waW4vRG9jdW1lbnRzL01lbmRpeC9EZXBhcnRtZW50IE9mIEhlYWx0aC1tYWluL2RlcGxveW1lbnQvdG1wL2pzYWN0aW9ucy5qcyJdLCJzb3VyY2VzQ29udGVudCI6WyIvLyBUaGlzIGZpbGUgd2FzIGdlbmVyYXRlZCBieSBNZW5kaXggU3R1ZGlvIFByby5cclxuLy9cclxuLy8gV0FSTklORzogT25seSB0aGUgZm9sbG93aW5nIGNvZGUgd2lsbCBiZSByZXRhaW5lZCB3aGVuIGFjdGlvbnMgYXJlIHJlZ2VuZXJhdGVkOlxyXG4vLyAtIHRoZSBpbXBvcnQgbGlzdFxyXG4vLyAtIHRoZSBjb2RlIGJldHdlZW4gQkVHSU4gVVNFUiBDT0RFIGFuZCBFTkQgVVNFUiBDT0RFXHJcbi8vIC0gdGhlIGNvZGUgYmV0d2VlbiBCRUdJTiBFWFRSQSBDT0RFIGFuZCBFTkQgRVhUUkEgQ09ERVxyXG4vLyBPdGhlciBjb2RlIHlvdSB3cml0ZSB3aWxsIGJlIGxvc3QgdGhlIG5leHQgdGltZSB5b3UgZGVwbG95IHRoZSBwcm9qZWN0LlxyXG5pbXBvcnQgeyBCaWcgfSBmcm9tIFwiYmlnLmpzXCI7XHJcblxyXG4vLyBCRUdJTiBFWFRSQSBDT0RFXHJcbi8vIEVORCBFWFRSQSBDT0RFXHJcblxyXG4vKipcclxuICogQHBhcmFtIHtCaWd9IG51bWJlclxyXG4gKiBAcmV0dXJucyB7UHJvbWlzZS48c3RyaW5nPn1cclxuICovXHJcbmV4cG9ydCBhc3luYyBmdW5jdGlvbiBKYXZhU2NyaXB0X2FjdGlvbihudW1iZXIpIHtcclxuXHQvLyBCRUdJTiBVU0VSIENPREVcclxuXHJcbiAgY29uc3QgZmlyc3QgPSBbJycsJ29uZSAnLCd0d28gJywndGhyZWUgJywnZm91ciAnLCAnZml2ZSAnLCdzaXggJywnc2V2ZW4gJywnZWlnaHQgJywnbmluZSAnLCd0ZW4gJywnZWxldmVuICcsJ3R3ZWx2ZSAnLCd0aGlydGVlbiAnLCdmb3VydGVlbiAnLCdmaWZ0ZWVuICcsJ3NpeHRlZW4gJywnc2V2ZW50ZWVuICcsJ2VpZ2h0ZWVuICcsJ25pbmV0ZWVuICddO1xyXG4gIGNvbnN0IHRlbnMgPSBbJycsICcnLCAndHdlbnR5JywndGhpcnR5JywnZm9ydHknLCdmaWZ0eScsICdzaXh0eScsJ3NldmVudHknLCdlaWdodHknLCduaW5ldHknXTtcclxuICBjb25zdCBtYWQgPSBbJycsICd0aG91c2FuZCcsICdtaWxsaW9uJywgJ2JpbGxpb24nLCAndHJpbGxpb24nXTtcclxuICBsZXQgd29yZCA9ICcnO1xyXG5cclxuICBmb3IgKGxldCBpID0gMDsgaSA8IG1hZC5sZW5ndGg7IGkrKykge1xyXG4gICAgbGV0IHRlbXBOdW1iZXIgPSBudW1iZXIlKDEwMCpNYXRoLnBvdygxMDAwLGkpKTtcclxuICAgIGlmIChNYXRoLmZsb29yKHRlbXBOdW1iZXIvTWF0aC5wb3coMTAwMCxpKSkgIT09IDApIHtcclxuICAgICAgaWYgKE1hdGguZmxvb3IodGVtcE51bWJlci9NYXRoLnBvdygxMDAwLGkpKSA8IDIwKSB7XHJcbiAgICAgICAgd29yZCA9IGZpcnN0W01hdGguZmxvb3IodGVtcE51bWJlci9NYXRoLnBvdygxMDAwLGkpKV0gKyBtYWRbaV0gKyAnICcgKyB3b3JkO1xyXG4gICAgICB9IGVsc2Uge1xyXG4gICAgICAgIHdvcmQgPSB0ZW5zW01hdGguZmxvb3IodGVtcE51bWJlci8oMTAqTWF0aC5wb3coMTAwMCxpKSkpXSArICctJyArIGZpcnN0W01hdGguZmxvb3IodGVtcE51bWJlci9NYXRoLnBvdygxMDAwLGkpKSUxMF0gKyBtYWRbaV0gKyAnICcgKyB3b3JkO1xyXG4gICAgICB9XHJcbiAgICB9XHJcblxyXG4gICAgdGVtcE51bWJlciA9IG51bWJlciUoTWF0aC5wb3coMTAwMCxpKzEpKTtcclxuICAgIGlmIChNYXRoLmZsb29yKHRlbXBOdW1iZXIvKDEwMCpNYXRoLnBvdygxMDAwLGkpKSkgIT09IDApIHdvcmQgPSBmaXJzdFtNYXRoLmZsb29yKHRlbXBOdW1iZXIvKDEwMCpNYXRoLnBvdygxMDAwLGkpKSldICsgJ2h1bmRyZWQgJyArIHdvcmQ7XHJcbiAgfVxyXG4gICAgcmV0dXJuIHdvcmQ7XHJcblxyXG5cdC8vIEVORCBVU0VSIENPREVcclxufVxyXG4iLCIvLyBUaGlzIGZpbGUgd2FzIGdlbmVyYXRlZCBieSBNZW5kaXggU3R1ZGlvIFByby5cclxuLy9cclxuLy8gV0FSTklORzogT25seSB0aGUgZm9sbG93aW5nIGNvZGUgd2lsbCBiZSByZXRhaW5lZCB3aGVuIGFjdGlvbnMgYXJlIHJlZ2VuZXJhdGVkOlxyXG4vLyAtIHRoZSBpbXBvcnQgbGlzdFxyXG4vLyAtIHRoZSBjb2RlIGJldHdlZW4gQkVHSU4gVVNFUiBDT0RFIGFuZCBFTkQgVVNFUiBDT0RFXHJcbi8vIC0gdGhlIGNvZGUgYmV0d2VlbiBCRUdJTiBFWFRSQSBDT0RFIGFuZCBFTkQgRVhUUkEgQ09ERVxyXG4vLyBPdGhlciBjb2RlIHlvdSB3cml0ZSB3aWxsIGJlIGxvc3QgdGhlIG5leHQgdGltZSB5b3UgZGVwbG95IHRoZSBwcm9qZWN0LlxyXG5pbXBvcnQgeyBCaWcgfSBmcm9tIFwiYmlnLmpzXCI7XHJcblxyXG4vLyBCRUdJTiBFWFRSQSBDT0RFXHJcbi8vIEVORCBFWFRSQSBDT0RFXHJcblxyXG4vKipcclxuICogVXBkYXRlcyBhbiBlbnRpdHkgb2JqZWN0IHdpdGhvdXQgbmVlZGluZyB0byByZWZyZXNoIHRoZSB3aG9sZSBwYWdlIHZpYSBwYXNzaW5nIGFuIGVudGl0eSBvYmplY3QuXHJcbiAqIEBwYXJhbSB7TXhPYmplY3R9IG9iamVjdFRvUmVmcmVzaCAtIE9iamVjdCB3aGljaCB3aWxsIGJlIHJlZnJlc2hlZC5cclxuICogQHJldHVybnMge1Byb21pc2UuPHZvaWQ+fVxyXG4gKi9cclxuZXhwb3J0IGFzeW5jIGZ1bmN0aW9uIFJlZnJlc2hPYmplY3Qob2JqZWN0VG9SZWZyZXNoKSB7XHJcblx0Ly8gQkVHSU4gVVNFUiBDT0RFXHJcbiAgICBpZiAoIW9iamVjdFRvUmVmcmVzaCkge1xyXG4gICAgICAgIHJldHVybiBQcm9taXNlLnJlamVjdChuZXcgRXJyb3IoXCJPYmplY3RUb1JlZnJlc2ggcGFyYW1ldGVyIGlzIHJlcXVpcmVkXCIpKTtcclxuICAgIH1cclxuICAgIHJldHVybiBuZXcgUHJvbWlzZShyZXNvbHZlID0+IHtcclxuICAgICAgICBteC5kYXRhLnVwZGF0ZSh7XHJcbiAgICAgICAgICAgIGd1aWQ6IG9iamVjdFRvUmVmcmVzaC5nZXRHdWlkKCksXHJcbiAgICAgICAgICAgIGNhbGxiYWNrOiAoKSA9PiByZXNvbHZlKHRydWUpXHJcbiAgICAgICAgfSk7XHJcbiAgICB9KTtcclxuXHQvLyBFTkQgVVNFUiBDT0RFXHJcbn1cclxuIiwibW9kdWxlLmV4cG9ydHMgPSBfX1dFQlBBQ0tfRVhURVJOQUxfTU9EVUxFX2JpZ19qc19fOyIsIi8vIFRoZSBtb2R1bGUgY2FjaGVcbnZhciBfX3dlYnBhY2tfbW9kdWxlX2NhY2hlX18gPSB7fTtcblxuLy8gVGhlIHJlcXVpcmUgZnVuY3Rpb25cbmZ1bmN0aW9uIF9fd2VicGFja19yZXF1aXJlX18obW9kdWxlSWQpIHtcblx0Ly8gQ2hlY2sgaWYgbW9kdWxlIGlzIGluIGNhY2hlXG5cdHZhciBjYWNoZWRNb2R1bGUgPSBfX3dlYnBhY2tfbW9kdWxlX2NhY2hlX19bbW9kdWxlSWRdO1xuXHRpZiAoY2FjaGVkTW9kdWxlICE9PSB1bmRlZmluZWQpIHtcblx0XHRyZXR1cm4gY2FjaGVkTW9kdWxlLmV4cG9ydHM7XG5cdH1cblx0Ly8gQ3JlYXRlIGEgbmV3IG1vZHVsZSAoYW5kIHB1dCBpdCBpbnRvIHRoZSBjYWNoZSlcblx0dmFyIG1vZHVsZSA9IF9fd2VicGFja19tb2R1bGVfY2FjaGVfX1ttb2R1bGVJZF0gPSB7XG5cdFx0Ly8gbm8gbW9kdWxlLmlkIG5lZWRlZFxuXHRcdC8vIG5vIG1vZHVsZS5sb2FkZWQgbmVlZGVkXG5cdFx0ZXhwb3J0czoge31cblx0fTtcblxuXHQvLyBFeGVjdXRlIHRoZSBtb2R1bGUgZnVuY3Rpb25cblx0X193ZWJwYWNrX21vZHVsZXNfX1ttb2R1bGVJZF0obW9kdWxlLCBtb2R1bGUuZXhwb3J0cywgX193ZWJwYWNrX3JlcXVpcmVfXyk7XG5cblx0Ly8gUmV0dXJuIHRoZSBleHBvcnRzIG9mIHRoZSBtb2R1bGVcblx0cmV0dXJuIG1vZHVsZS5leHBvcnRzO1xufVxuXG4iLCIvLyBnZXREZWZhdWx0RXhwb3J0IGZ1bmN0aW9uIGZvciBjb21wYXRpYmlsaXR5IHdpdGggbm9uLWhhcm1vbnkgbW9kdWxlc1xuX193ZWJwYWNrX3JlcXVpcmVfXy5uID0gKG1vZHVsZSkgPT4ge1xuXHR2YXIgZ2V0dGVyID0gbW9kdWxlICYmIG1vZHVsZS5fX2VzTW9kdWxlID9cblx0XHQoKSA9PiAobW9kdWxlWydkZWZhdWx0J10pIDpcblx0XHQoKSA9PiAobW9kdWxlKTtcblx0X193ZWJwYWNrX3JlcXVpcmVfXy5kKGdldHRlciwgeyBhOiBnZXR0ZXIgfSk7XG5cdHJldHVybiBnZXR0ZXI7XG59OyIsIi8vIGRlZmluZSBnZXR0ZXIgZnVuY3Rpb25zIGZvciBoYXJtb255IGV4cG9ydHNcbl9fd2VicGFja19yZXF1aXJlX18uZCA9IChleHBvcnRzLCBkZWZpbml0aW9uKSA9PiB7XG5cdGZvcih2YXIga2V5IGluIGRlZmluaXRpb24pIHtcblx0XHRpZihfX3dlYnBhY2tfcmVxdWlyZV9fLm8oZGVmaW5pdGlvbiwga2V5KSAmJiAhX193ZWJwYWNrX3JlcXVpcmVfXy5vKGV4cG9ydHMsIGtleSkpIHtcblx0XHRcdE9iamVjdC5kZWZpbmVQcm9wZXJ0eShleHBvcnRzLCBrZXksIHsgZW51bWVyYWJsZTogdHJ1ZSwgZ2V0OiBkZWZpbml0aW9uW2tleV0gfSk7XG5cdFx0fVxuXHR9XG59OyIsIl9fd2VicGFja19yZXF1aXJlX18ubyA9IChvYmosIHByb3ApID0+IChPYmplY3QucHJvdG90eXBlLmhhc093blByb3BlcnR5LmNhbGwob2JqLCBwcm9wKSkiLCIvLyBkZWZpbmUgX19lc01vZHVsZSBvbiBleHBvcnRzXG5fX3dlYnBhY2tfcmVxdWlyZV9fLnIgPSAoZXhwb3J0cykgPT4ge1xuXHRpZih0eXBlb2YgU3ltYm9sICE9PSAndW5kZWZpbmVkJyAmJiBTeW1ib2wudG9TdHJpbmdUYWcpIHtcblx0XHRPYmplY3QuZGVmaW5lUHJvcGVydHkoZXhwb3J0cywgU3ltYm9sLnRvU3RyaW5nVGFnLCB7IHZhbHVlOiAnTW9kdWxlJyB9KTtcblx0fVxuXHRPYmplY3QuZGVmaW5lUHJvcGVydHkoZXhwb3J0cywgJ19fZXNNb2R1bGUnLCB7IHZhbHVlOiB0cnVlIH0pO1xufTsiLCJleHBvcnQgY29uc3QgTmFub2Zsb3dDb21tb25zJFJlZnJlc2hPYmplY3QgPSBhc3luYyAoKSA9PiAoYXdhaXQgaW1wb3J0KFwiQzovVXNlcnMvZ29waW4vRG9jdW1lbnRzL01lbmRpeC9EZXBhcnRtZW50IE9mIEhlYWx0aC1tYWluL2phdmFzY3JpcHRzb3VyY2UvbmFub2Zsb3djb21tb25zL2FjdGlvbnMvUmVmcmVzaE9iamVjdFwiKSkuUmVmcmVzaE9iamVjdDtcbmV4cG9ydCBjb25zdCBNeUZpcnN0TW9kdWxlJEphdmFTY3JpcHRfYWN0aW9uID0gYXN5bmMgKCkgPT4gKGF3YWl0IGltcG9ydChcIkM6L1VzZXJzL2dvcGluL0RvY3VtZW50cy9NZW5kaXgvRGVwYXJ0bWVudCBPZiBIZWFsdGgtbWFpbi9qYXZhc2NyaXB0c291cmNlL215Zmlyc3Rtb2R1bGUvYWN0aW9ucy9KYXZhU2NyaXB0X2FjdGlvblwiKSkuSmF2YVNjcmlwdF9hY3Rpb247XG4iXSwibmFtZXMiOlsiQmlnIiwiSmF2YVNjcmlwdF9hY3Rpb24iLCJudW1iZXIiLCJmaXJzdCIsInRlbnMiLCJtYWQiLCJ3b3JkIiwiaSIsImxlbmd0aCIsInRlbXBOdW1iZXIiLCJNYXRoIiwicG93IiwiZmxvb3IiLCJSZWZyZXNoT2JqZWN0Iiwib2JqZWN0VG9SZWZyZXNoIiwiUHJvbWlzZSIsInJlamVjdCIsIkVycm9yIiwicmVzb2x2ZSIsIm14IiwiZGF0YSIsInVwZGF0ZSIsImd1aWQiLCJnZXRHdWlkIiwiY2FsbGJhY2siLCJOYW5vZmxvd0NvbW1vbnMkUmVmcmVzaE9iamVjdCIsIk15Rmlyc3RNb2R1bGUkSmF2YVNjcmlwdF9hY3Rpb24iXSwic291cmNlUm9vdCI6IiJ9