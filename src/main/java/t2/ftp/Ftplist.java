package t2.ftp;


import org.apache.commons.net.ftp.FTPClient;

import org.apache.commons.net.ftp.FTPFile;

import org.apache.commons.net.ftp.FTPReply;


import java.io.IOException;

import java.text.DateFormat;

import java.text.SimpleDateFormat;


public class Ftplist {
	 
public static void main(String[] args) {
	       
 String server="ftp.mozilla.org";
	        
int port=21;
	       
 String user="anonymous";
	   
 String pass="";
	        	
	        
FTPClient ftpclient=new FTPClient();
	       
 try{
	        	
ftpclient.connect(server,port);
	        	
showServerReply(ftpclient);
	        	
int replycode=ftpclient.getReplyCode();
	        	
if(!FTPReply.isPositiveCompletion(replycode)){

System.out.println("Connect failed");

return;
	        	}

 boolean success=ftpclient.login(user,pass);
	
        if(!success){
	 
       	System.out.println("Could not login to the server");

	        	return;
	        }

	        FTPFile[] files1=ftpclient.listFiles();
	
        
	        printFileDetails(files1);

	       
	        }
	        catch(IOException ex){
	
        	System.out.println("Something wrong happened");
	
        	ex.printStackTrace();
	        }
finally{

	        	try{if (ftpclient.isConnected()) {

	                     ftpclient.logout();

	                     ftpclient.disconnect();
	                 }

	        	}

	        	catch(IOException ex){
	   
     		ex.printStackTrace();

	        	}

	        }

	    }


	

	private static void printFileDetails(FTPFile[] files) throws IOException {

		
		DateFormat dateformater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
		if (files != null){

		for (int i = 0; i < files.length; i++){
	
		String details =files[i].getName();

			
			details+="\t\t"+files[i].getSize();

			details+="\t\t"+dateformater.format(files[i].getTimestamp().getTime());
	
		
		System.out.println(details);
	
	
		}

		}

	}


	private static void showServerReply(FTPClient ftpclient) {

		 String[] replies = ftpclient.getReplyStrings();

	        if (replies != null && replies.length > 0) {
	
            for (String aReply : replies) {

	                System.out.println("SERVER: " + aReply);
	            }
	 
       }

		
	}

}





