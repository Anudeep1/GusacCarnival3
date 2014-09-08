GusacCarnival3
==============

GUSAC Carnival 3 Android Application

Send Message php file
<?php 
$con=mysqli_connect("bestseoindiaorg.fatcowmysql.com","kites","kites","testgcm");

if(mysqli_connect_error($con))
{
echo"failed to connect".mysqli_connect_error();

}
else
{
echo" connection established";
}

?>

 <?php
// please enter the api_key you received from google console
	$api_key = "AIzaSyB6x6lA4fZF5Hu6N1dfWKe5zRtr0yfU2C0";
       $eid=$_POST["number"];
       $message1 =$_POST["messagepost"];

mysqli_query($con,"INSERT INTO events(eid,message) VALUES('$eid','$message1')");

$result=mysqli_query($con,"select enames from enames where eid='$eid'");

$ro=mysqli_fetch_array($result); 
$s=$ro['enames'];

date_default_timezone_set("Asia/Kolkata"); 
     $time=date('d-m-Y H:i:s'); //Returns IST



	// please enter the registration id of the device on which you want to send the message
	 
// run query
$query = mysqli_query($con,"SELECT id FROM  gcmreguser");

// set array


while($row=mysqli_fetch_array($query))
{
$registrationIDs[]=$row['id'];

}
	$message = array("number" =>$s , "messagepost" => $message1,"timestamp"=>$time );
	$url = 'https://android.googleapis.com/gcm/send';
	$fields = array(
                'registration_ids'  => $registrationIDs,
                'data'              => array( "message" => $message ),
                );

	$headers = array(
					'Authorization: key=' . $api_key,
					'Content-Type: application/json');
					
					
					
	$ch = curl_init();
	curl_setopt($ch, CURLOPT_URL, $url);
	curl_setopt( $ch, CURLOPT_POST, true );
	curl_setopt( $ch, CURLOPT_HTTPHEADER, $headers);
	curl_setopt( $ch, CURLOPT_RETURNTRANSFER, true );
	curl_setopt( $ch, CURLOPT_POSTFIELDS, json_encode( $fields ) );
	$result = curl_exec($ch);
	curl_close($ch);
	
echo $result;
?>


Get Device php file


<?php
	$id = $_POST["regid"];
	 
$link = mysql_connect('bestseoindiaorg.fatcowmysql.com', 'kites', 'kites'); 
if (!$link) { 
    die('Could not connect: ' . mysql_error()); 
} 
echo 'Connected successfully'; 
mysql_select_db("testgcm",$link);
// replace sql query according to your mysql table
	mysql_query("INSERT INTO gcmreguser(id) VALUES('".$id."')");
        echo "successs";

$eid="Gusac";
$message1="Welcome to GusacCarnival3.0!! Thank You for installing. Your device is successfully registered. You don't have to miss any event, offer or fun coz our event managers will be updating the latest information available during the carnival through this Cloud Service. Have a Happy Carnival ";
date_default_timezone_set("Asia/Kolkata"); 
     $time=date('d-m-Y H:i:s'); //Returns IST
$api_key = "AIzaSyB6x6lA4fZF5Hu6N1dfWKe5zRtr0yfU2C0";
$registrationIDs=array();
$registrationIDs[0]=$id;
print_r($registrationIDs);

	$message = array("number" => $eid, "messagepost" => $message1,"timestamp"=>$time );
	$url = 'https://android.googleapis.com/gcm/send';
	$fields = array(
                'registration_ids'  => $registrationIDs,
                'data'              => array( "message" => $message ),
                );

	$headers = array(
					'Authorization: key=' . $api_key,
					'Content-Type: application/json');
					
					
					
	$ch = curl_init();
	curl_setopt($ch, CURLOPT_URL, $url);
	curl_setopt( $ch, CURLOPT_POST, true );
	curl_setopt( $ch, CURLOPT_HTTPHEADER, $headers);
	curl_setopt( $ch, CURLOPT_RETURNTRANSFER, true );
	curl_setopt( $ch, CURLOPT_POSTFIELDS, json_encode( $fields ) );
	$result = curl_exec($ch);
	curl_close($ch);
	
echo $result;
	
	
?>
