package com.tutorials;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class TestMain {
  
  public static void main(String[] args)
  {   
    List<String> urls = Arrays.asList("http://www.fancysite.com", "http://www.fancysite.com/xyz/xyz.html", "http://www.fancysite.com/abc/xyz/pqr.html");
    TestMain t=new TestMain();
    t.countLevelOfUrls(urls);
  }
  
  public void countLevelOfUrls(List<String> urls)
  {
	 
	    for (String url : urls) {
	      try {
	        URI uri = new URI(url);
	        String path = uri.getPath();
	        int length = (path.split("/")).length;
	        System.out.println(uri +" is at level "+ (length-1));
	      }
	      catch (URISyntaxException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    
	    
  }
}

