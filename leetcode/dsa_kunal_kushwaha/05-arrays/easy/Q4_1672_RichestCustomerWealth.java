public class Q4RichestCustomerWealth {
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1}};

                int max = 0;
                int sum = 0;
                for(int i=0;i<accounts.length;i++){
                    for(int j=0;j<accounts[i].length;j++){
                        sum += accounts[i][j];
                    }
                    if(sum>max){
                        max = sum;
                    }
                    sum = 0;
                }
        System.out.println(max);


    }
}
