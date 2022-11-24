package leetcode;
// not optimised
public class easy_2446 {
    class Solution {
        public static void main(String[] args) {
            
        }
        public static boolean haveConflict(String[] event1, String[] event2) {
            StringBuilder t1 = new StringBuilder(event1[1]);
            StringBuilder t2 = new StringBuilder(event2[0]);
            StringBuilder c1 = new StringBuilder(event1[0]);
            StringBuilder c2 = new StringBuilder(event2[1]);
            if((t1.charAt(0)*10+t1.charAt(1))==(t2.charAt(0)*10+t2.charAt(1))&&(c1.charAt(0)*10+c1.charAt(1))==(c2.charAt(0)*10+c2.charAt(1)))
            {
                 if((c1.charAt(3)*10+c1.charAt(4))>(c2.charAt(3)*10+c2.charAt(4))){
                    return false; 
                }
                else{
                         if((t1.charAt(3)*10+t1.charAt(4))<(t2.charAt(3)*10+t2.charAt(4))){
                    return false; 
                }
                return true;
                }
            }
    
            else{{if((c1.charAt(0)*10+c1.charAt(1))<(c2.charAt(0)*10+c2.charAt(1)))
            {if((t1.charAt(0)*10+t1.charAt(1))<(t2.charAt(0)*10+t2.charAt(1))){
               return false; 
            }
            else if((t1.charAt(0)*10+t1.charAt(1))==(t2.charAt(0)*10+t2.charAt(1))){
                if((t1.charAt(3)*10+t1.charAt(4))<(t2.charAt(3)*10+t2.charAt(4))){
                    return false; 
                }
                return true;    
            }
            else {
                return true;
            }}
            else if((c1.charAt(0)*10+c1.charAt(1))==(c2.charAt(0)*10+c2.charAt(1))){
                if((c1.charAt(3)*10+c1.charAt(4))>(c2.charAt(3)*10+c2.charAt(4))){
                    return false; 
                }
                return true;
            }
            else{
                return false;
            }
        }}}}}

