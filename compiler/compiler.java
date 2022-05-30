import java.util.*;
import java.io.*;

public class compiler {
    public static void main(String[] args) {
        try {
          File myObj = new File("myLang.txt");
          Scanner myReader = new Scanner(myObj);
          Scanner scan = new Scanner(System.in);
          String data = myReader.nextLine();

          // arraylist of variables to store all the variables the user makes
          ArrayList<Variable> varArr = new ArrayList<Variable>();

          while (true)
          { 
            // runs checkComment to see if there are any comments in the line / if so ignores everything after the comment sign
            checkComment(data);
            // makes sure it's valid syntax
            if (data.indexOf("(") >=0 && data.indexOf(")") >= 0) {

                // finds the command the line is instantiating
                String command = data.substring(data.indexOf("(")+1, data.indexOf(")"));

                // making string variable
                if (command.equals("str")) {
                    // checking for valid syntax
                    if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        // pulls variable name
                        String varName = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                        // pulls that part that the user wants printed
                        String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        // getting the string part out
                        if (printPart.indexOf("\"") >=0 && printPart.indexOf("\'") >= 0) {
                            // grabs only the string without the quotations
                            String strval = printPart.substring(printPart.indexOf("\"")+1, printPart.indexOf("\'"));
                            // creates a new Variable object and adds it to the arraylist of Variables
                            Variable temp = new Variable(varName, "str", strval);
                            varArr.add(temp);
                        }
                        else { // if error
                            error();
                            break;
                        }
                    }
                    else {
                        error();
                        break;
                    }
                    if (myReader.hasNextLine()) { // if there's a next line, moves to next line
                        data = myReader.nextLine();
                    }
                    else {
                        break;
                    }
                }

                // making int variable
                if (command.equals("int")) {
                    // checks validity of syntax
                    if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        // same as above
                        String varName = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                        String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        Variable temp = new Variable(varName, "int", printPart);
                        varArr.add(temp);
                    }
                    else {
                        error();
                        break;
                    }
                    if (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    else {
                        break;
                    }
                }

                // print
                if (command.equals("p")) {
                    if (data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        // printing a string
                        if (printPart.indexOf("\"") >=0 && printPart.indexOf("\'") >= 0) {
                            // grabs the parts inside the quotes and prints
                            System.out.println(printPart.substring(printPart.indexOf("\"")+1, printPart.indexOf("\'")));
                        }
                        // printing a variable
                        else if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.substring(data.indexOf("[")+1, data.indexOf("]")).equals("var")) {
                            // looks through the arraylist of Variables to make sure there's one that matches the variable the user wants to print
                            for (int i = 0; i < varArr.size(); i++) {
                                if (varArr.get(i).getName().equals(printPart)) {
                                    System.out.println(varArr.get(i).getValue());
                                    i = i + varArr.size();
                                }
                                // if a variable matching the variable name has not been found
                                else if (i == varArr.size()-1) {
                                    error();
                                    break;
                                }
                            }
                        }
                        // printing an integer or non-specified string
                        else if (data.indexOf("[") < 0 && data.indexOf("]") < 0) {
                            System.out.println(data.substring(data.indexOf("{")+1, data.indexOf("}")));
                        }
                        else {
                            error();
                            break;
                        }
                    }
                    else { // syntax is wrong
                        error();
                        break;
                    }
                    if (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    else {
                        break;
                    }
                }

                // taking user input
                if (command.equals("in")) {
                    if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        String type = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                        String varName = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        String content = scan.nextLine();
                        // creating new variable based on user input and type
                        if (type.equals("str")) {
                            Variable temp = new Variable(varName, "str", content);
                            varArr.add(temp);
                        }
                        else if (type.equals("int")) {
                            Variable temp = new Variable(varName, "int", content);
                            varArr.add(temp);
                        }
                        else {
                            error();
                            break;
                        }
                    }
                    else {
                        error();
                        break;
                    }
                    if (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    else {
                        break;
                    }
                }

                // if statement
                if (command.equals("if")) {
                    if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        // grabbing information about the if statement
                        String condition = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                        String comparison = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        String leftComp = data.substring(data.indexOf("[")+1, data.indexOf("{"));
                        String rightComp = data.substring(data.indexOf("}")+1, data.indexOf("]"));

                        // if both items being compared are raw strings
                        if (leftComp.indexOf("\"") >= 0 && leftComp.indexOf("\'") >=0 && rightComp.indexOf("\"") >= 0 && rightComp.indexOf("\'") >=0) {
                            String leftContent = leftComp.substring(leftComp.indexOf("\"")+1, leftComp.indexOf("\'"));
                            String rightContent = rightComp.substring(rightComp.indexOf("\"")+1, rightComp.indexOf("\'"));
                            // checking for equality
                            if (comparison.equals("=")) {
                                if (leftContent.equals(rightContent)) {
                                    data = myReader.nextLine();
                                    data = myReader.nextLine();
                                }
                                else {
                                    while (!data.equals(")")) {
                                        data = myReader.nextLine();
                                    }
                                }
                            }
                            // left is greater than right
                            else if (comparison.equals(">")) {
                                if (leftContent.compareTo(rightContent) > 0) {
                                    data = myReader.nextLine();
                                    data = myReader.nextLine();
                                }
                                else {
                                    while (!data.equals(")")) {
                                        data = myReader.nextLine();
                                    }
                                }
                            }
                            // right is greater than left
                            else if (comparison.equals("<")) {
                                if (leftContent.compareTo(rightContent) < 0) {
                                    data = myReader.nextLine();
                                    data = myReader.nextLine();
                                }
                                else {
                                    while (!data.equals(")")) {
                                        data = myReader.nextLine();
                                    }
                                }
                            }
                            // left greater than or equal to right
                            else if (comparison.equals(">=")) {
                                if (leftContent.compareTo(rightContent) > 0 || leftContent.equals(rightContent)) {
                                    data = myReader.nextLine();
                                    data = myReader.nextLine();
                                }
                                else {
                                    while (!data.equals(")")) {
                                        data = myReader.nextLine();
                                    }
                                }
                            }
                            // right greater than or equal to left
                            else if (comparison.equals("<=")) {
                                if (leftContent.compareTo(rightContent) < 0 || leftContent.equals(rightContent)) {
                                    data = myReader.nextLine();
                                    data = myReader.nextLine();
                                }
                                else {
                                    while (!data.equals(")")) {
                                        data = myReader.nextLine();
                                    }
                                }
                            }
                            else {
                                error();
                                break;
                            }
                        }

                        // both variables
                        else if (leftComp.indexOf("\"") < 0 && leftComp.indexOf("\'") < 0 && rightComp.indexOf("\"") < 0 && rightComp.indexOf("\'") < 0) {
                            String a = "";
                            int aIndex = -1;
                            String b = "";
                            int bIndex = -1;

                            // finds value of left variable
                            for (int i = 0; i < varArr.size(); i++) {
                                if (varArr.get(i).getName().equals(leftComp)) {
                                    a = varArr.get(i).getValue();
                                    aIndex = i;
                                    i = i + varArr.size();
                                }
                                // if a variable matching the variable name has not been found
                                else if (i == varArr.size()-1) {
                                    error();
                                    break;
                                }
                            }

                            // finds value of right variable
                            for (int i = 0; i < varArr.size(); i++) {
                                if (varArr.get(i).getName().equals(rightComp)) {
                                    b = varArr.get(i).getValue();
                                    bIndex = i;
                                    i = i + varArr.size();
                                }
                                // if a variable matching the variable name has not been found
                                else if (i == varArr.size()-1) {
                                    error();
                                    break;
                                }
                            }

                            // if both variables are integers - repeats the samE as above but with ints
                            if (varArr.get(aIndex).getType().equals("int") && varArr.get(bIndex).getType().equals("int")) {
                                int intA = Integer.parseInt(a);
                                int intB = Integer.parseInt(b);

                                if (comparison.equals("=")) {
                                    if (intA == intB) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals(">")) {
                                    if (intA > intB) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals("<")) {
                                    if (intA < intB) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals(">=")) {
                                    if (intA >= intB) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals("<=")) {
                                    if (intA <= intB) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else {
                                    error();
                                    break;
                                }
                            }

                            // if variables are strings - repeats same as above
                            else if (varArr.get(aIndex).getType().equals("str") && varArr.get(bIndex).getType().equals("str")) {
                                if (comparison.equals("=")) {
                                    if (a.equals(b)) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals(">")) {
                                    if (a.compareTo(b) > 0) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals("<")) {
                                    if (a.compareTo(b) < 0) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals(">=")) {
                                    if (a.compareTo(b) > 0 || a.equals(b)) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else if (comparison.equals("<=")) {
                                    if (a.compareTo(b) < 0 || a.equals(b)) {
                                        data = myReader.nextLine();
                                        data = myReader.nextLine();
                                    }
                                    else {
                                        while (!data.equals(")")) {
                                            data = myReader.nextLine();
                                        }
                                    }
                                }
                                else {
                                    error();
                                    break;
                                }
                            }
                        }

                    }
                    else {
                        error();
                        break;
                    }
                }
                // both the things being compared are raw integers - same as above
                if(command.equals("int if")) {
                    if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                        String condition = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                        String comparison = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                        String leftComp = data.substring(data.indexOf("[")+1, data.indexOf("{"));
                        String rightComp = data.substring(data.indexOf("}")+1, data.indexOf("]"));
                        int intA = Integer.parseInt(leftComp);
                        int intB = Integer.parseInt(rightComp);

                        if (comparison.equals("=")) {
                            if (intA == intB) {
                                data = myReader.nextLine();
                                data = myReader.nextLine();
                            }
                            else {
                                while (!data.equals(")")) {
                                    data = myReader.nextLine();
                                }
                            }
                        }
                        else if (comparison.equals(">")) {
                            if (intA > intB) {
                                data = myReader.nextLine();
                                data = myReader.nextLine();
                            }
                            else {
                                while (!data.equals(")")) {
                                    data = myReader.nextLine();
                                }
                            }
                        }
                        else if (comparison.equals("<")) {
                            if (intA < intB) {
                                data = myReader.nextLine();
                                data = myReader.nextLine();
                            }
                            else {
                                while (!data.equals(")")) {
                                    data = myReader.nextLine();
                                }
                            }
                        }
                        else if (comparison.equals(">=")) {
                            if (intA >= intB) {
                                data = myReader.nextLine();
                                data = myReader.nextLine();
                            }
                            else {
                                while (!data.equals(")")) {
                                    data = myReader.nextLine();
                                }
                            }
                        }
                        else if (comparison.equals("<=")) {
                            if (intA <= intB) {
                                data = myReader.nextLine();
                                data = myReader.nextLine();
                            }
                            else {
                                while (!data.equals(")")) {
                                    data = myReader.nextLine();
                                }
                            }
                        }
                        else {
                            error();
                            break;
                        }
                    }
                }

                // math calculations
                if (command.equals("math")) {
                    if (data.indexOf("\\") >= 0 && data.indexOf("/") >= 0) {
                        // getting all the info about the operation to perform from the data
                        String varName = data.substring(data.indexOf("\\") + 1, data.indexOf("/"));
                        String left = data.substring(data.indexOf("[") + 1, data.indexOf("{"));
                        String right = data.substring(data.indexOf("}") + 1, data.indexOf("]"));
                        int intA = Integer.parseInt(left);
                        int intB = Integer.parseInt(right);
                        String operation = data.substring(data.indexOf("{") + 1, data.indexOf("}"));
                        // addition
                        if (operation.equals("+")) {
                            int answer = intA + intB;
                            String s = Integer.toString(answer);
                            Variable temp = new Variable(varName, "int", s);
                            varArr.add(temp);
                        }
                        // subtraction
                        else if (operation.equals("-")) {
                            int answer = intA - intB;
                            String s = Integer.toString(answer);
                            Variable temp = new Variable(varName, "int", s);
                            varArr.add(temp);
                        }
                        // multiplication
                        else if (operation.equals("*")) {
                            int answer = intA * intB;
                            String s = Integer.toString(answer);
                            Variable temp = new Variable(varName, "int", s);
                            varArr.add(temp);
                        }
                        // division
                        else if (operation.equals("/")) {
                            int answer = intA/intB;
                            String s = Integer.toString(answer);
                            Variable temp = new Variable(varName, "int", s);
                            varArr.add(temp);
                        }
                        // mod
                        else if (operation.equals("%")) {
                            int answer = intA % intB;
                            String s = Integer.toString(answer);
                            Variable temp = new Variable(varName, "int", s);
                            varArr.add(temp);
                        }
                        else {
                            error();
                            break;
                        }
                    }
                    else {
                        error();
                        break;
                    }
                    if (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    else {
                        break;
                    }
                }

                // loops
                if (command.equals("loop")) {
                    if (data.indexOf("[") >= 0 && data.indexOf("]") >= 0) {
                        // arraylist to store the commands that it needs to loop through
                        ArrayList<String> loopLines = new ArrayList<String>();
                        // number of times user wants to loop through
                        String strnum = data.substring(data.indexOf("[") + 1, data.indexOf("]"));
                        int num = Integer.parseInt(strnum);
                        data = myReader.nextLine();
                        data = myReader.nextLine();
                        // adds each line of code within the loop into an arraylist
                        while (!data.equals(")")) {
                            loopLines.add(data);
                            data = myReader.nextLine();
                        }
                        // loops through the correct # of times
                        for (int v = 0; v < num; v++) {
                            // goes through each item in the arraylist containing the code
                            for (int m = 0; m < loopLines.size(); m++) {
                                // this is basically a repeat of everything that was above this so i didn't comment most things below here
                                data = loopLines.get(m);
                                checkComment(data);
                                if (data.indexOf("(") >=0 && data.indexOf(")") >= 0) {
                                    // finds the command the line is instantiating
                                    command = data.substring(data.indexOf("(")+1, data.indexOf(")"));

                                    // making string variable
                                    if (command.equals("str")) {
                                        if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String varName = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                                            String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            // getting the string part out
                                            if (printPart.indexOf("\"") >=0 && printPart.indexOf("\'") >= 0) {
                                                String strval = printPart.substring(printPart.indexOf("\"")+1, printPart.indexOf("\'"));
                                                Variable temp = new Variable(varName, "str", strval);
                                                varArr.add(temp);
                                            }
                                            else {
                                                error();
                                                break;
                                            }
                                        }
                                        else {
                                            error();
                                            break;
                                        }
                                        continue;
                                    }

                                    // making int variable
                                    if (command.equals("int")) {
                                        if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String varName = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                                            String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            Variable temp = new Variable(varName, "int", printPart);
                                            varArr.add(temp);
                                        }
                                        else {
                                            error();
                                            break;
                                        }
                                        continue;
                                    }

                                    // print
                                    if (command.equals("p")) {
                                        if (data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String printPart = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            // printing a string
                                            if (printPart.indexOf("\"") >=0 && printPart.indexOf("\'") >= 0) {
                                                System.out.println(printPart.substring(printPart.indexOf("\"")+1, printPart.indexOf("\'")));
                                            }
                                            // printing a variable
                                            else if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.substring(data.indexOf("[")+1, data.indexOf("]")).equals("var")) {
                                                for (int i = 0; i < varArr.size(); i++) {
                                                    if (varArr.get(i).getName().equals(printPart)) {
                                                        System.out.println(varArr.get(i).getValue());
                                                        i = i + varArr.size();
                                                    }
                                                    // if a variable matching the variable name has not been found
                                                    else if (i == varArr.size()-1) {
                                                        error();
                                                        break;
                                                    }
                                                }
                                            }
                                            // printing an integer or non-specified string
                                            else if (data.indexOf("[") < 0 && data.indexOf("]") < 0) {
                                                System.out.println(data.substring(data.indexOf("{")+1, data.indexOf("}")));
                                            }
                                            else {
                                                error();
                                                break;
                                            }
                                        }
                                        else { // syntax is wrong
                                            error();
                                            break;
                                        }
                                        continue;
                                    }

                                    // taking user input
                                    if (command.equals("in")) {
                                        if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String type = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                                            String varName = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            String content = scan.nextLine();
                                            // creating new variable based on user input and type
                                            if (type.equals("str")) {
                                                Variable temp = new Variable(varName, "str", content);
                                                varArr.add(temp);
                                            }
                                            else if (type.equals("int")) {
                                                Variable temp = new Variable(varName, "int", content);
                                                varArr.add(temp);
                                            }
                                            else {
                                                error();
                                                break;
                                            }
                                        }
                                        else {
                                            error();
                                            break;
                                        }
                                        continue;
                                    }

                                    // if statement
                                    if (command.equals("if")) {
                                        if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String condition = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                                            String comparison = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            String leftComp = data.substring(data.indexOf("[")+1, data.indexOf("{"));
                                            String rightComp = data.substring(data.indexOf("}")+1, data.indexOf("]"));

                                            // both raw strings
                                            if (leftComp.indexOf("\"") >= 0 && leftComp.indexOf("\'") >=0 && rightComp.indexOf("\"") >= 0 && rightComp.indexOf("\'") >=0) {
                                                String leftContent = leftComp.substring(leftComp.indexOf("\"")+1, leftComp.indexOf("\'"));
                                                String rightContent = rightComp.substring(rightComp.indexOf("\"")+1, rightComp.indexOf("\'"));
                                                if (comparison.equals("=")) {
                                                    if (leftContent.equals(rightContent)) {
                                                        data = myReader.nextLine();
                                                        data = myReader.nextLine();
                                                    }
                                                    else {
                                                        while (!data.equals(")")) {
                                                            data = myReader.nextLine();
                                                        }
                                                    }
                                                }
                                                else if (comparison.equals(">")) {
                                                    if (leftContent.compareTo(rightContent) > 0) {
                                                        data = myReader.nextLine();
                                                        data = myReader.nextLine();
                                                    }
                                                    else {
                                                        while (!data.equals(")")) {
                                                            data = myReader.nextLine();
                                                        }
                                                    }
                                                }
                                                else if (comparison.equals("<")) {
                                                    if (leftContent.compareTo(rightContent) < 0) {
                                                        data = myReader.nextLine();
                                                        data = myReader.nextLine();
                                                    }
                                                    else {
                                                        while (!data.equals(")")) {
                                                            data = myReader.nextLine();
                                                        }
                                                    }
                                                }
                                                else if (comparison.equals(">=")) {
                                                    if (leftContent.compareTo(rightContent) > 0 || leftContent.equals(rightContent)) {
                                                        data = myReader.nextLine();
                                                        data = myReader.nextLine();
                                                    }
                                                    else {
                                                        while (!data.equals(")")) {
                                                            data = myReader.nextLine();
                                                        }
                                                    }
                                                }
                                                else if (comparison.equals("<=")) {
                                                    if (leftContent.compareTo(rightContent) < 0 || leftContent.equals(rightContent)) {
                                                        data = myReader.nextLine();
                                                        data = myReader.nextLine();
                                                    }
                                                    else {
                                                        while (!data.equals(")")) {
                                                            data = myReader.nextLine();
                                                        }
                                                    }
                                                }
                                                else {
                                                    error();
                                                    break;
                                                }
                                            }

                                            // both variables
                                            else if (leftComp.indexOf("\"") < 0 && leftComp.indexOf("\'") < 0 && rightComp.indexOf("\"") < 0 && rightComp.indexOf("\'") < 0) {
                                                String a = "";
                                                int aIndex = -1;
                                                String b = "";
                                                int bIndex = -1;

                                                // finds value of left variable
                                                for (int i = 0; i < varArr.size(); i++) {
                                                    if (varArr.get(i).getName().equals(leftComp)) {
                                                        a = varArr.get(i).getValue();
                                                        aIndex = i;
                                                        i = i + varArr.size();
                                                    }
                                                    // if a variable matching the variable name has not been found
                                                    else if (i == varArr.size()-1) {
                                                        error();
                                                        break;
                                                    }
                                                }

                                                // finds value of right variable
                                                for (int i = 0; i < varArr.size(); i++) {
                                                    if (varArr.get(i).getName().equals(rightComp)) {
                                                        b = varArr.get(i).getValue();
                                                        bIndex = i;
                                                        i = i + varArr.size();
                                                    }
                                                    // if a variable matching the variable name has not been found
                                                    else if (i == varArr.size()-1) {
                                                        error();
                                                        break;
                                                    }
                                                }

                                                // if variables are integers
                                                if (varArr.get(aIndex).getType().equals("int") && varArr.get(bIndex).getType().equals("int")) {
                                                    int intA = Integer.parseInt(a);
                                                    int intB = Integer.parseInt(b);

                                                    if (comparison.equals("=")) {
                                                        if (intA == intB) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals(">")) {
                                                        if (intA > intB) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals("<")) {
                                                        if (intA < intB) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals(">=")) {
                                                        if (intA >= intB) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals("<=")) {
                                                        if (intA <= intB) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        error();
                                                        break;
                                                    }
                                                }

                                                // if variables are strings
                                                else if (varArr.get(aIndex).getType().equals("str") && varArr.get(bIndex).getType().equals("str")) {
                                                    if (comparison.equals("=")) {
                                                        if (a.equals(b)) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals(">")) {
                                                        if (a.compareTo(b) > 0) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals("<")) {
                                                        if (a.compareTo(b) < 0) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals(">=")) {
                                                        if (a.compareTo(b) > 0 || a.equals(b)) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else if (comparison.equals("<=")) {
                                                        if (a.compareTo(b) < 0 || a.equals(b)) {
                                                            data = myReader.nextLine();
                                                            data = myReader.nextLine();
                                                        }
                                                        else {
                                                            while (!data.equals(")")) {
                                                                data = myReader.nextLine();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        error();
                                                        break;
                                                    }
                                                }
                                            }

                                        }
                                        else {
                                            error();
                                            break;
                                        }
                                    }
                                    // both raw integers
                                    if(command.equals("int if")) {
                                        if (data.indexOf("[") >=0 && data.indexOf("]") >= 0 && data.indexOf("{") >=0 && data.indexOf("}") >= 0) {
                                            String condition = data.substring(data.indexOf("[")+1, data.indexOf("]"));
                                            String comparison = data.substring(data.indexOf("{")+1, data.indexOf("}"));
                                            String leftComp = data.substring(data.indexOf("[")+1, data.indexOf("{"));
                                            String rightComp = data.substring(data.indexOf("}")+1, data.indexOf("]"));
                                            int intA = Integer.parseInt(leftComp);
                                            int intB = Integer.parseInt(rightComp);

                                            if (comparison.equals("=")) {
                                                if (intA == intB) {
                                                    data = myReader.nextLine();
                                                    data = myReader.nextLine();
                                                }
                                                else {
                                                    while (!data.equals(")")) {
                                                        data = myReader.nextLine();
                                                    }
                                                }
                                            }
                                            else if (comparison.equals(">")) {
                                                if (intA > intB) {
                                                    data = myReader.nextLine();
                                                    data = myReader.nextLine();
                                                }
                                                else {
                                                    while (!data.equals(")")) {
                                                        data = myReader.nextLine();
                                                    }
                                                }
                                            }
                                            else if (comparison.equals("<")) {
                                                if (intA < intB) {
                                                    data = myReader.nextLine();
                                                    data = myReader.nextLine();
                                                }
                                                else {
                                                    while (!data.equals(")")) {
                                                        data = myReader.nextLine();
                                                    }
                                                }
                                            }
                                            else if (comparison.equals(">=")) {
                                                if (intA >= intB) {
                                                    data = myReader.nextLine();
                                                    data = myReader.nextLine();
                                                }
                                                else {
                                                    while (!data.equals(")")) {
                                                        data = myReader.nextLine();
                                                    }
                                                }
                                            }
                                            else if (comparison.equals("<=")) {
                                                if (intA <= intB) {
                                                    data = myReader.nextLine();
                                                    data = myReader.nextLine();
                                                }
                                                else {
                                                    while (!data.equals(")")) {
                                                        data = myReader.nextLine();
                                                    }
                                                }
                                            }
                                            else {
                                                error();
                                                break;
                                            }
                                        }
                                    }

                                    // math calculations
                                    if (command.equals("math")) {
                                        if (data.indexOf("\\") >= 0 && data.indexOf("/") >= 0) {
                                            // getting all the info about the operation to perform from the data
                                            String varName = data.substring(data.indexOf("\\") + 1, data.indexOf("/"));
                                            String left = data.substring(data.indexOf("[") + 1, data.indexOf("{"));
                                            String right = data.substring(data.indexOf("}") + 1, data.indexOf("]"));
                                            int intA = Integer.parseInt(left);
                                            int intB = Integer.parseInt(right);
                                            String operation = data.substring(data.indexOf("{") + 1, data.indexOf("}"));
                                            // addition
                                            if (operation.equals("+")) {
                                                int answer = intA + intB;
                                                String s = Integer.toString(answer);
                                                Variable temp = new Variable(varName, "int", s);
                                                varArr.add(temp);
                                            }
                                            // subtraction
                                            else if (operation.equals("-")) {
                                                int answer = intA - intB;
                                                String s = Integer.toString(answer);
                                                Variable temp = new Variable(varName, "int", s);
                                                varArr.add(temp);
                                            }
                                            // multiplication
                                            else if (operation.equals("*")) {
                                                int answer = intA * intB;
                                                String s = Integer.toString(answer);
                                                Variable temp = new Variable(varName, "int", s);
                                                varArr.add(temp);
                                            }
                                            // division
                                            else if (operation.equals("/")) {
                                                int answer = intA/intB;
                                                String s = Integer.toString(answer);
                                                Variable temp = new Variable(varName, "int", s);
                                                varArr.add(temp);
                                            }
                                            // mod
                                            else if (operation.equals("%")) {
                                                int answer = intA % intB;
                                                String s = Integer.toString(answer);
                                                Variable temp = new Variable(varName, "int", s);
                                                varArr.add(temp);
                                            }
                                            else { // error
                                                error();
                                                break;
                                            }
                                        }
                                        else {
                                            error();
                                            break;
                                        }
                                        continue;
                                    }
                                }
                                // if the line is just a ) [presumably the end of an if statement or loop; so it doesn't do anything]
                                else if (data.indexOf(")") == 0 && data.indexOf("(") == -1) {
                                    continue;
                                }
                            }
                                        }
                                    }
                                        else {
                                            error();
                                            break;
                                        }
                                    }
                                
                                }
            // if the line is just a ) [presumably the end of an if statement or loop; so it doesn't do anything]
            else if (data.indexOf(")") == 0 && data.indexOf("(") == -1) {
                if (myReader.hasNextLine()) {                
                    data = myReader.nextLine();                
                }
                else {
                    break;
                }
            }                
          }
          myReader.close();
        }
        // if file is not found
        catch (FileNotFoundException e) {
          System.out.println("File was not found.");
          e.printStackTrace();
        }
    }

    // function that runs when there is an error
    public static void error() {
        System.out.println("There is an error.");
    }

    // checks for a comment; if there is one, cut off the commented part from the string
    public static void checkComment(String data) {
        if (data.indexOf("$") >= 0) {
            data = data.substring(0, data.indexOf("$"));
        }
    }
}