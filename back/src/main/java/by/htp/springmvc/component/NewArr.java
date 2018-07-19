package by.htp.springmvc.component;

import java.util.Arrays;

public class NewArr {
	private SimpleNew [] articles = new SimpleNew[2];

	public NewArr() {
	}

	public NewArr(SimpleNew[] articles) {
		this.articles = articles;
	}

	

	public SimpleNew[] getArticles() {
		return articles;
	}

	public void setArticles(SimpleNew[] articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "NewArr [articles=" + Arrays.toString(articles) + "]";
	}
}
