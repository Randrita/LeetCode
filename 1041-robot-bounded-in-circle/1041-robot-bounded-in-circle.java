class Solution {
    public boolean isRobotBounded(String instructions) {
        char dir ='N';
        int x=0,y=0;
        
        for(int i=0;i<instructions.length();i++){
            if(instructions.charAt(i)=='G'){
                if(dir=='N'){
                    y++;
                }
                else if(dir=='S'){
                    y--;
                }
                else if(dir=='E'){
                    x++;
                }
                else{
                    x--;
                }
                    
            }
            
            else if(instructions.charAt(i)=='L'){
                if(dir=='N'){
                    dir='W';
                }
                else if(dir=='S'){
                    dir='E';
                }
                else if(dir=='E'){
                    dir='N';
                }
                else{
                    dir='S';
                }
                    
            }
            
            else{
                //for R
                 if(dir=='N'){
                    dir='E';
                }
                else if(dir=='S'){
                    dir='W';
                }
                else if(dir=='E'){
                    dir='S';
                }
                else{
                    dir='N';
                }
                
            }
            
        
        }
        
        return (x==0 && y==0 || dir != 'N');
    }
}