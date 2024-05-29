package in.ashokit.dto;

import java.util.List;

public class QuoteApiResponse {
	//this purpose of api  response class it is used to hole the, 
	//response for the  given by 3rd party api.
	// 1 response of 3rd party api quote,
	// 1 quote text available,author available.
	//API response multiple quote value  values are coming.
	// this is a randam array 
	private QuoteDto[] quotes;

	public QuoteDto[] getQuotes() {
		return quotes;
	}

	public void setQuotes(QuoteDto[] quotes) {
		this.quotes = quotes;
	}
	
	
	
	//this(QuoteApiResponse) is used to store the data response,
	//by given quote API.
	//all the quotations  into my java class.
	//private List<QuoteDto> quotes;

}
