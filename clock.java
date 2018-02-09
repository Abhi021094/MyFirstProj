package clock;


class clock
{
    public static void main(String args[])
    {
        int sec = 0;
        int min = 0;
        int hour = 0;
        
            for(hour=1;hour<=24;hour++)
            {
            	
            	
                for(min=1;min<=60;min++)
                {
                    for(sec=1;sec<=60;sec++)
                    {
                    	if(hour>23){
                        	hour=0;
                        }
                    	
                    	
                    	
                    	
                      
                    	if (hour<12)
                       {
                    	    if(hour<10 && min<10 && sec<10){                                                 //hour,min,sec<10
                    		   System.out.println("0"+hour+":0"+ min+":0"+sec+" AM");
                    		   }
                    	    else if(hour<10 && min<10 && sec>9){                                            //hour,min<10 and sec>9
                 			   System.out.println("0"+hour+":0"+ min+":"+sec+" AM");
                 		   }
                    	    else if (hour<10 && min>10 && sec<10){                                           //hour,sec<10 and min>9
                    	    	System.out.println("0"+hour+":"+ min+":0"+sec+" AM");
                    	    	
                    	    }
                    	                     		   
                    		   else if(hour>9 && min<10 && sec<10){                                             //hour>9 but min,sec<10
                    			   System.out.println(hour+":0"+ min+":0"+sec+" AM");
                    		   }
                    		  
                    		   else if(hour<10 && min>9 && sec>9){                                              //min,sec>9 but hour<10
                    			   
                    	   
                    	   System.out.println("0"+hour+":"+ min+":"+sec+"  AM");
                    	   }
                    		   else if(hour>9 && min>9 && sec<10){                                                 //hour,min>9 but sec<10
                    			   
                            	   
                            	   System.out.println(""+hour+":"+ min+":0"+sec+"  AM");
                            	   }
                    	    
                                else if(hour>9 && min<10 && sec>9){                                               //hour,sec>9 but min<10
                    			   
                            	   
                            	   System.out.println(""+hour+":0"+ min+":"+sec+"  AM");
                            	   }
                                else if(hour>9 && min>9 && sec>9){                                                 //hour,min.sec>9
                     			   
                             	   
                             	   System.out.println(""+hour+":"+ min+":"+sec+"  AM");
                             	   }
                    	    
                    		   
                    			   
                    		   }
                    
                       
                    else if(hour>=12)
                       {
                    	if(min<10 && sec<10){
                    		System.out.println(hour+":0"+min+":0"+sec+" PM");
                    		
                       }
                    	else if(min<10 && sec>9){
                    		System.out.println(hour+":0"+min+":"+sec+" PM");
                    	}
                    	else if(min>9 && sec<10){
                    		System.out.println(hour+":"+min+":0"+sec+" PM");
                    	}
                    	else if(min>9 && sec>9){
                    		System.out.println(hour+":"+min+":"+sec+" PM");
                    	}
                    	
                                     	
                       }                                	   
                       
    //        else {
           // 	System.out.println("invalid time");
           // 	
            //     }
                     //	 System.out.println(hour+":"+ min+":"+sec);
                          try{Thread.sleep(1000);}
                         catch(Exception e){}
                         for(int i=0;i<10;i++)
                         {
                             System.out.println("");
                         }
                    
                }

                }
                if (hour>23){
                	hour=0;
               }
            }

        }
    }



