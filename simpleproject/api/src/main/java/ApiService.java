public class ApiService {

    public void apiService(){
        CoreService service = new CoreService();
        service.getCoreService();
    }
    public static void main(String args[]){
        ApiService apiService =new ApiService();
        apiService.apiService();
    }

}
