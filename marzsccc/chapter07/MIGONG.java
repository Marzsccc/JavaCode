package chapter07;

public class MIGONG {
    public static void main(String[] args){
        //1.创建迷宫，用二维数组表示 int map[][] = new int[8][7];
        //2.规定 map的元素值 0可以走 1 不能走
        int map[][] = new int [8][7];
        //3.将最上面的一行和最下面的一行全部设置为1
        for(int j=0;j<map[0].length;j++){ //traversing columns
            map[0][j] = 1; //第一行
            map[7][j] = 1;
        }
        //4.将最左边和最右边设置为1
        for(int i=0;i<map.length;i++){ // traversing row
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //5. 将[3][1],[3][2] 设为1
        map[3][1] = 1;
        map[3][2]=map[3][1];
/*
* int[i][j] a=new int[i][j]
* chapter06.二维数组.length = 数组的行数
* a[0] .length = 数组的列数
*
* */
        //输出当前地图
        System.out.println("=====当前地图情况=======");
        for(int i =0;i< map.length;i++){  //外层循环 遍历行
            for (int j =0; j<map[i].length;j++){  // 内层循环 遍历列
                System.out.print(map[i][j]+ " ");// 输出一行
            }
            System.out.println();
        }

        // performance findway to find a road for mouth
        T10 t1 = new T10();
        t1.findWay(map,1,1);
        System.out.println("\n=======找路的情况========");
        for(int i =0;i< map.length;i++){  //外层循环 遍历行
            for (int j =0; j<map[i].length;j++){  // 内层循环 遍历列
                System.out.print(map[i][j]+ " ");// 输出一行
            }
            System.out.println();
        }

    }
}


class T10{
    /*
    *  使用递归回溯的思想解决老鼠出迷宫的问题
    *
    * @fuction: findWay is to find a path for get out
    * @return:find return ture,else return false
    * @position: [i][j] denotes the position of mouth, the initialized location is [1][1]
    * @principle: for every [][] use 0 denotes can go, 1 denotes roadblock, 2 denotes can pass, 3 means walked but not passing
    * @principle: when map[6][5] turn to 2 means we find the way out(program over),else continue find way
    * @strategy: Escape routes for rats: down -> right -> up -> left
    * */
    public boolean findWay(int[][] map,int i,int j){
        if(map[6][5]==2){ // already find the wat out
            return true;
        }else{
            if(map[i][j]==0){ // means can go
                //...
                // assume the current location can pass
                map[i][j] = 2;
                //Use a pathfinding strategy to determine whether the location can be passing
                //down -> right -> up -> left
                if(findWay(map,i+1,j)){ //down
                    return true;
                }else if(findWay(map,i,j+1)){ //right
                    return true;
                }else if(findWay(map,i-1,j)){// up
                    return true;
                }else if(findWay(map,i,j-1)){// left
                    return true;
                }else {
                    map[i][j] =3;
                    return false;
                }

            }else{// map[i][j] can be 1,2,3
                return false;
            }

        }
    }
}

