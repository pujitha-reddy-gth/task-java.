package com.inheritance;

 class Book2 {
	 
	 Book2() {
	       
	    }

	    Book2(String title) {
	        
	    }
	}

		class EBook extends Book2 {
		    EBook() {
		        
		    }

		    EBook(String title) {
		        super(title); 
		        System.out.println("EBook Title: " + title);
		    }
		}

		