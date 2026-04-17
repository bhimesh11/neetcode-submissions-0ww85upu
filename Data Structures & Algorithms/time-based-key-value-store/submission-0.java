class TimeStamp{
    public int timestamp;
    public String value;

    public TimeStamp(int timestamp,String value)
    {
        this.timestamp = timestamp;
        this.value = value;
    }
}
class TimeMap {

public Map<String,ArrayList<TimeStamp>> timeStamps ;
    public TimeMap() {
        timeStamps = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(!timeStamps.containsKey(key))
        {
            timeStamps.put(key, new ArrayList<>());
        }
     ArrayList<TimeStamp> ts =   timeStamps.get(key);
     ts.add(new TimeStamp(timestamp,value));

    }
    
    public String get(String key, int timestamp) {
       if(!timeStamps.containsKey(key)){
        return "";
       }
         ArrayList<TimeStamp> ts =   timeStamps.get(key);
      Optional<TimeStamp> st =   performBinarySearch(ts,timestamp);
      if(st.isEmpty())
      {
        return "";
      }
     
       
        return st.get().value;
    }

    public Optional<TimeStamp> performBinarySearch(ArrayList<TimeStamp> ts,int target)
    {
        int low =0;
        int high = ts.size()-1;
        int minAns = -1;

        while(low<=high)
        {
            int mid = (low + high)/2;
            TimeStamp curr = ts.get(mid);
            if(curr.timestamp<= target)
            {
                low = mid+1;
                minAns = mid;
            }else{
                high = mid-1;
            }
        }
        if(minAns==-1)
        {
            return Optional.empty();
        }
        return Optional.of(ts.get(minAns));

    }
}
