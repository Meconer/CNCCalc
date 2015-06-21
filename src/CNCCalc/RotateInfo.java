/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNCCalc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mats
 */
public class RotateInfo {

    static final String floatRegex = "[-+]?[0-9]*\\.?[0-9]+";

    String iAdress, jAdress, xAdress, yAdress;
    String planeAxis;
    String arcXAxisRegex;
    String arcYAxisRegex;
    String arcIAxisRegex;
    String arcJAxisRegex;

    Pattern aXRegexPattern;
    Pattern aYRegexPattern;
    Pattern aIRegexPattern;
    Pattern aJRegexPattern;

    Pattern patternArr[] = { aXRegexPattern,
                             aYRegexPattern,
                             aIRegexPattern,
                             aJRegexPattern
    };

    String addressArr[] = { xAdress, yAdress, iAdress, jAdress };
    
   
    public RotateInfo(String planeAxis) {
        this.planeAxis = planeAxis;
        switch (planeAxis) {
            case "Z":
                xAdress = "X";
                yAdress = "Y";
                iAdress = "I";
                jAdress = "J";
                break;
            case "Y":
                xAdress = "X";
                yAdress = "Z";
                iAdress = "I";
                jAdress = "K";
                break;
            case "X":
                xAdress = "Z";
                yAdress = "Y";
                iAdress = "J";
                jAdress = "K";
                break;
            default:
                xAdress = "";
                xAdress = "";
                yAdress = "";
                iAdress = "";
                jAdress = "";
        }

        arcXAxisRegex = xAdress + floatRegex;
        aXRegexPattern = Pattern.compile(arcXAxisRegex);

        arcYAxisRegex = yAdress + floatRegex;
        aYRegexPattern = Pattern.compile(arcYAxisRegex);

        arcIAxisRegex = iAdress + floatRegex;
        aIRegexPattern = Pattern.compile(arcIAxisRegex);

        arcJAxisRegex = jAdress + floatRegex;
        aJRegexPattern = Pattern.compile(arcJAxisRegex);

    }

    String rotateLine(String line) {
        String resultLine = line;

        for (int i = 0; i < 4; i++) {
            Matcher m = patternArr[i].matcher(line);
            while (m.find()) {
                String s = m.group();
                s = "[" + addressArr[i] + s.substring(1, s.length());
                resultLine = resultLine.substring(0, m.start()) + s + resultLine.substring(m.end(), resultLine.length());
            }
        }
        return resultLine;
    }

}


