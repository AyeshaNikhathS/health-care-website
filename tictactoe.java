import java.util.*;
class tictactoe{
    static void displayBoard(char board[][]){
        for(char x[]:board){
            system.out.println(x);

        }

    }
    static void insertPosition(char board[][],int playerPos)
    char ch;
    if(playerType.equals("player"))
    switch(playerPos){
        case 1:board[0][0]='x';
        break;
        case 2:board[0][2]='x';
        break;
        case 3:board[0][4]='x';
        break;
        case 4:board[2][0]='x';
        break;
        case 5:board[2][2]='x';
        break;
        case 6:board[2][4]='x';
        break;
        case 7:board[4][0]='x';
        break;
        case 8:board[4][2]='x';
        break;
        case 9:board[4][4]='x';
        break;
        default:System.out.println("inavlid position,please enter a valid number");
        break;
        

        

    }
    }
    

public class Launchtictactoe{
    public static void main(String[] args){
        char board[][]={{'','|','','|',''},
        {'-','+','-','+','-'},
        {'','|','','|',''},
        {'-','+','-','+','-'},
        {'','|','','|',''}},

        tictactoe.displayBoard(board);

        Scanner scan=new Scanner(System.in);
        System.out.println("player,kindly enter the possible");
        int playerPos=scan.nextInt();

        tictactoe.insertPosition(board,playerPos);
        tictactoe.displayBoard(board);

        }
    }
