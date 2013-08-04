
import java.util.*;
import java.io.*;

public class MainViz {


    public static void main(String[] args) {
        
        try
		{


            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(bf.readLine());
            for(int i=0;i<t;i++){
                
               String si = bf.readLine();
               int set=0;
               System.out.print("Case #"+(i+1)+": ");
               String[] kk = si.split(" ");
               int num1 = Integer.parseInt(kk[0]);
               int num2 = Integer.parseInt(kk[1]);
               HashMap<Integer,Integer> hm = new HashMap();
               for(int m=num1; m<=num2; m++)
               {
                            String va = Integer.toString(m);
                            for(int g=va.length()-1;g>=1;g--)
                            {
                                String s1 = va.substring(g,va.length()) + va.substring(0,g);
                                int num = Integer.parseInt(s1);
                                if( (num>=num1 && num<=num2) && num!=m )
                                {
                                      if(!hm.containsKey(num))
                                      {
                                          if(hm.containsKey(m))
                                          {
                                              if(hm.get(m)==num) continue;
                                          }
                                          hm.put(m, num);
                                          set++;
                                      }
                                }
                            }
               }

              System.out.println(set);
            }


                
                
        
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        }

    }


