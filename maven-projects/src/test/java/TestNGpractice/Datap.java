package TestNGpractice;

import org.testng.annotations.DataProvider;

public class Datap 
{
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "XA5671", "affgfghf" },
	      new Object[] { "AS5458", "hjkhkjkjk" },
	      new Object[] { "AS5457", "hjkhkjkjr" },
	      new Object[] { "AS5468", "hjkhkjkjb" },
	      new Object[] { "AS5458", "hjkhkjkjs" },
	      new Object[] { "AS5497", "hjkhkjkjy" },

	    };
	  }
	}


