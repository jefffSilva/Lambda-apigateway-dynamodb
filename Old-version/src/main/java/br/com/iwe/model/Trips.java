package br.com.iwe.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "trips")
public class Trips {

	@DynamoDBHashKey(attributeName = "country")
	private String country;
	@DynamoDBRangeKey(attributeName = "city")
	private String city;

	@DynamoDBIndexRangeKey(attributeName = "dateTimeCreation", localSecondaryIndexName = "dateTimeCreationIndex")
	private String dateTimeCreation;

	@DynamoDBAttribute(attributeName = "url")
	private String url;
	@DynamoDBAttribute(attributeName = "description")
	private String description;

	@DynamoDBIndexRangeKey(attributeName = "consumed", localSecondaryIndexName = "consumedIndex")
	private String consumed;

	public Trips(String country, String dateTimeCreation, String city, String url, String description, String consumed) {
		super();
		this.country = country;
		this.dateTimeCreation = dateTimeCreation;
		this.city = city;
		this.url = url;
		this.description = description;
		this.consumed = consumed;
	}

	public Trips() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateTimeCreation() {
		return dateTimeCreation;
	}

	public void setDateTimeCreation(String dateTimeCreation) {
		this.dateTimeCreation = dateTimeCreation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConsumed() {
		return consumed;
	}

	public void setConsumed(String consumed) {
		this.consumed = consumed;
	}

}
