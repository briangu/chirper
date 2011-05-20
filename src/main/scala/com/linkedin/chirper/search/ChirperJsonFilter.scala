package com.linkedin.chirper.search

import java.text._
import com.sensei.indexing.api.JsonFilter
import org.json.JSONObject

class ChirperJsonFilter extends JsonFilter{
	override def filter(obj:JSONObject): JSONObject = {
		obj
	}	
}
