package com.vintrace.breakdown


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests(@Autowired val restTemplate: TestRestTemplate) {

	@Test
	fun `year endpoint returns 200`() {
		val entity = restTemplate.getForEntity<String>("/api/breakdown/year/?id=abc33")
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("yearID: abc33")
	}
	@Test
	fun `variety endpoint returns 200`() {
		val entity = restTemplate.getForEntity<String>("/api/breakdown/variety/?id=abc33")
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("varietyID: abc33")
	}
	@Test
	fun `region endpoint returns 200`() {
		val entity = restTemplate.getForEntity<String>("/api/breakdown/region/?id=abc33")
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("regionID: abc33")
	}
	@Test
	fun `year-variety endpoint returns 200`() {
		val entity = restTemplate.getForEntity<String>("/api/breakdown/year-variety/?id=abc33")
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("yvID: abc33")
	}





}
