package com.vintrace.breakdown

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class BreakdownApplication

fun main(args: Array<String>) {
	runApplication<BreakdownApplication>(*args)
}
@RestController
class BreakDown {

	//todo stubbed endpoint
	@GetMapping("api/breakdown/year")
	@ResponseBody
	fun getYear(@RequestParam id: String): String? {
		return "yearID: $id"
	}

	//todo stubbed endpoint
	@GetMapping("api/breakdown/variety")
	@ResponseBody
	fun getVariety(@RequestParam id: String): String? {
		return "varietyID: $id"
	}

	//todo stubbed endpoint
	@GetMapping("api/breakdown/region")
	@ResponseBody
	fun getRegion(@RequestParam id: String): String? {
		return "regionID: $id"
	}

	//todo stubbed endpoint
	@GetMapping("api/breakdown/year-variety")
	@ResponseBody
	fun getYearVariety(@RequestParam id: String): String? {
		return "yvID: $id"
	}
}

