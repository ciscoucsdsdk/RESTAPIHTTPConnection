
public class HTTPConnectionTest {

	public static void main(String[] args) throws Exception {
		//APIHTTPConnection automtion = new APIHTTPConnection();
				long start=System.currentTimeMillis();
				APIHTTPConnection.sendGet("BE920C0AC1E142C6959FF25C75E361C8", "https://172.29.110.241/app/api/rest?formatType=json&opName=userAPIGetAllVMs&opData={}");
				//APIHTTPConnection.sendGet("E877ECC05669426E8246FE53F16A2639", "http://172.29.110.238/app/api/rest?formatType=json&opName=userAPIGetAllVMs&opData={}");
				long end=System.currentTimeMillis();
				
				
				System.out.println("Total Time in mills "+ (end-start));
				
				start=System.currentTimeMillis();
				try{
				APIHTTPConnection.sendGet("BE920C0AC1E142C6959FF25C75E361C8", "https://172.29.110.241/app/api/rest?formatType=json&user=$USER&password=$PASS&opName=getRESTKey&opData={}");
				//APIHTTPConnection.sendGet("E877ECC05669426E8246FE53F16A2639", "http://172.29.110.238/app/api/rest?formatType=json&opName=userAPIGetAllVMs&opData={}");
				}catch(Exception e ){
					System.out.println(e.getMessage());
				}
				end=System.currentTimeMillis();
				
				
				System.out.println("Total Time in mills Fix server "+ (end-start));
				
				
				//CE632FD52FAB40FFBEC42EA02DABE012
				
				start=System.currentTimeMillis();
				try{
				APIHTTPConnection.sendGet("CE632FD52FAB40FFBEC42EA02DABE012", "https://10.23.210.125/app/api/rest?formatType=json&user=$USER&password=$PASS&opName=getRESTKey&opData={}");
				//APIHTTPConnection.sendGet("E877ECC05669426E8246FE53F16A2639", "http://172.29.110.238/app/api/rest?formatType=json&opName=userAPIGetAllVMs&opData={}");
				}catch(Exception e ){
					System.out.println(e.getMessage());
				}
				end=System.currentTimeMillis();
				
				
				System.out.println("Total Time in mills Fix server "+ (end-start));
	}

}
