public class CommandLineArguments {

	public static void main(String[] args) {

		 int sum = 0;
      
		  for (int index = 0; index < args.length; index++) {
        	    	int number = Integer.parseInt(args[index]);
            		sum += number;
        	}

	        System.out.println("Sum " + sum);

	}

}