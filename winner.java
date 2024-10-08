import java.util.HashMap;

public class winner {
    public static void main(String[] args) {
        int team[]={1,1,2,3,4,1,2,2,3,1};
        int vote[]={24,13,35,15,50,16,20,18,25,64};
        System.out.println(winner1(team,vote));
    }
    public static int winner1(int team[],int vote[])
    {
        HashMap<Integer,Integer>votecount=new HashMap<>();
        for(int i=0;i<vote.length;i++)
        {
            if(vote[i]>=18)
            {
                votecount.put(team[i], votecount.getOrDefault(team[i], 0) + 1);
            }
        }
        int maxvotes=0;
        int winner=-1;
        boolean tie=false;
        for(HashMap.Entry<Integer,Integer>entry:votecount.entrySet())
        {
            int currentteam=entry.getKey();
            int currentvotes=entry.getValue();
            if(currentvotes>maxvotes)
            {
                maxvotes=currentvotes;
                winner=currentteam;
                tie=false;
            }
            else if(currentvotes==maxvotes)
            {
                tie=true;
            }
        }
        if(tie||maxvotes==0)
        {
            return -1;
        }
        return winner;
    }
}
