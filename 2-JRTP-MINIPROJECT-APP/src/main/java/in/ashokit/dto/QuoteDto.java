package in.ashokit.dto;

public class QuoteDto {
		private String text;
		private String author;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}

	}


//quote dto is used to  represent the  response coming from the,
//3 rd party api.
//give the response  we are taking from 1 class is called QuoteDto.