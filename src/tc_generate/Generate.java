/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tc_generate;

import java.util.Random;

/**
 *
 * @author semih
 */
public class Generate {
    private int[] tc = new int[11];
    Random random = new Random();
    Check check = new Check();
    
    private void generateTC(){
        for(int i = 0; i < 11; i++){
            tc[i] = random.nextInt(10);
            
            while(tc[0] == 0){
                tc[0] = random.nextInt(10);
                
                if(tc[0] != 0){
                    break;
                }
            }
        }
        check.setTC(tc);
    }
    
    public String getTC(){
        generateTC();
        
        while(true){
            if(check.getCheck()){
                String _tc = "";
                
                for(int i : tc){
                    _tc += i;
                }
                
                return _tc;
            }
            else{
                generateTC();
            }
        }
    }
}
