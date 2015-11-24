package de.hska.ibsys.overview;

import java.util.ArrayList;
import java.util.List;

public class Overview{

	private List<OverviewArticle> articles;

	public Overview(){
		this.articles = new ArrayList<OverviewArticle>();
	}

	public List<OverviewArticle> getArticles() {
		return articles;
	}
	
	public void AddArticle(OverviewArticle article){
		this.articles.add(article);
	}
}
