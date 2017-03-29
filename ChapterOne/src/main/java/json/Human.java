package json;

/**
 * Created by Developer on 3/27/2017.
 */
public class Human {
    String message;
    Place place;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getMessage() {
        return message;
    }

    public Place getPlace() {
        return place;
    }

    void say(){
        System.out.println(getMessage() + " , " + getPlace().getName() + "!");
    }
}
