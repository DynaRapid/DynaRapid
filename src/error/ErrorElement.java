/*
* DynaRapid
*
* This file is part of DynaRapid project
* Copyright: See COPYING file that comes with this distribution
* For any questions, please contact Andrea Guerrieri <andrea.guerrieri@ieee.org> (C) 2024
*/



//This stores the error element of the errorLogger.

import java.util.*;
import java.io.*;

public class ErrorElement
    {
        public ArrayList<Integer> errorCode = new ArrayList<>();
        public ArrayList<String> errorString = new ArrayList<>();

        public void addEntry(int e, String s)
        {
            errorCode.add(e);
            errorString.add(s);
        }

        public void printEntry()
        {
            for(int i = 0; i < errorCode.size(); i++)
            {
                System.out.print(errorCode.get(i) + " : ");
                System.out.println(errorString.get(i) + "\n");
            }
        }
    }
