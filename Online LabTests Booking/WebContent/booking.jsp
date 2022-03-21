<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="booking.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
%>

 		<div class="contact-form">
            <form action="BookingServlet" method="post">

                <label for="name">Enter Name</label>
                <input type="text" id="name" name="name" placeholder="Name" required>

                <label for="age">Enter Age</label>
                <input type="text" id="age" name="age" placeholder="Age" required>

                <label for="line1">Enter Address Line 1</label>
                <input type="text" id="line1" name="address1" required placeholder="House No./Flat No., Floor, Apartment">

                <label for="line2">Enter Address Line 2</label>
                <input type="text" id="line2" name="address2" required placeholder="Road, Street, Locality">

                <label for="city">Enter City</label>
                <input type="text" id="city" name="city" required placeholder="Village/Town/City">

                <label for="selectTest">Choose Test</label>
                <select name="test" id="selectTest" onchange="optionChange()">
                    <option onchange="optionChange()" value="Covid RTPCR">2019 Novel Corona Virus - RT PCR</option>
                    <option onchange="optionChange()" value="CBC">Complete Blood Count (CBC)</option>
                    <option onchange="optionChange()" value="CRP">C-Reactive Protein (CRP)</option>
                    <option onchange="optionChange()" value="HbA1c">Glycosylated Haemoglobin (HbA1c)</option>
                    <option onchange="optionChange()" value="FBS">Fasting Blood Sugar (FBS)</option>
                    <option onchange="optionChange()" value="TFT">Thyroid Function Test (TFT)</option>
                    <option onchange="optionChange()" value="Urine Test">Urine Complete Analysis</option>
                    <option onchange="optionChange()" value="LFT">Liver Function Test (LFT)</option>
                    <option onchange="optionChange()" value="D-dimer">D-dimer</option>
                    <option onchange="optionChange()" value="KFT/RFT">Kidney Function Test Standard (KFT/RFT)</option>
                </select>

                <label for="testRate">Test Cost</label>
                <input type="text" name="rate" id="testRate" required value="750/-" >

                <label for="date">Choose Test Date</label>
                <input type="date" id="date" required name="date">

                <input type="submit" value="Book Test">
                
            </form>
            
        </div>

<script>
    function optionChange(){
        var x = document.getElementById("selectTest").selectedIndex;
        if(x==0){
            document.getElementById("testRate").value="750/-"
        }
        if(x==1){
            document.getElementById("testRate").value="300/-"
        }
        if(x==2){
            document.getElementById("testRate").value="450/-"
        }
        if(x==3){
            document.getElementById("testRate").value="480/-"
        }
        if(x==4){
            document.getElementById("testRate").value="70/-"
        }
        if(x==5){
            document.getElementById("testRate").value="480/-"
        }
        if(x==6){
            document.getElementById("testRate").value="150/-"
        }
        if(x==7){
            document.getElementById("testRate").value="700/-"
        }
        if(x==8){
            document.getElementById("testRate").value="1100/-"
        }
        if(x==9){
            document.getElementById("testRate").value="850/-"
        }
    }

    var today = new Date().toISOString().split('T')[0];
    document.getElementsByName("date")[0].setAttribute('min', today);
</script>

</body>
</html>