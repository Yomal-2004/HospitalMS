getALLPatients();

function savePatient(){
    let patientId=$('#exampleFormControlInput1').val();
    let name=$('#exampleFormControlInput2').val();
    let gender=$('#exampleFormControlInput3').val();

    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/patient/savePatient",
        async:true,
        data:JSON.stringify({
            "patientId": patientId,
            "name": name,
            "gender": gender
        }),
        success: function (data) {
            alert("Saved")
            getALLPatients();
        },
        error: function (xhr, exception){
            alert("Error")
        }
    })
}


function updatePatient(){
    let patientId=$('#exampleFormControlInput1').val();
    let name=$('#exampleFormControlInput2').val();
    let gender=$('#exampleFormControlInput3').val();

    $.ajax({
        method:"PUT",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/patient/updatePatient",
        async:true,
        data:JSON.stringify({
            "patientId": patientId,
            "name": name,
            "gender": gender
        }),
        success: function (data) {
            alert("Updated")
            getALLPatients();
        },
        error: function (xhr, exception){
            alert("Error")
        }
    })
}



function deletePatient(){
    let patientId=$('#exampleFormControlInput1').val();

    $.ajax({
        method:"DELETE",
        url:"http://localhost:8080/api/v1/patient/deletePatient/" + patientId,

        success: function (data) {
            alert("Deleted")
            getALLPatients();
        },
        error: function (xhr, exception){
            alert("Error")
        }
    });
}



function getALLPatients(){
    $.ajax({
        method:"GET",
        url:"http://localhost:8080/api/v1/patient/getPatients",
        async:true,
        success: function (data) {
            if (data.code==="00"){
                $('#patientTable').empty();
                for (let pat of data.content){
                    let patientId = pat.patientId
                    let name = pat.name
                    let gender = pat.gender

                    var row = `<tr><td>${patientId}</td><td>${name}</td><td>${gender}</td></tr>`;
                    $('#patientTable').append(row);
                }
            }
        },
        error: function (xhr, exception){
            alert("Error")
        }
    })
}

// Search Patient option

function searchPatient(){
    let id = $('#searchId').val(); // get value from input

    if(id == ""){
        alert("Please enter Patient ID");
        return;
    }

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/api/v1/patient/searchPatient/" + id,
        success: function(data){
            if(data.code === "00"){
                $('#patientTable').empty(); // clear table

                let p = data.content; // patient object
                let row = `<tr>
                    <td>${p.patientId}</td>
                    <td>${p.name}</td>
                    <td>${p.gender}</td>
                    </tr>`;
                $('#patientTable').append(row);

            } else {
                getALLPatients();
                alert(data.message); // "Patient Not Found"
                $('#patientTable').empty();
            }
        },
        error: function(){
            alert("Error while searching");
        }
    })
}

// Table row select operation

$(document).ready(function(){
    $(document).on('click','#patientTable tr',function (){
        var col0 = $(this).find('td:eq(0)').text();
        var col1 = $(this).find('td:eq(1)').text();
        var col2 = $(this).find('td:eq(2)').text();

        $('#exampleFormControlInput1').val(col0);
        $('#exampleFormControlInput2').val(col1);
        $('#exampleFormControlInput3').val(col2);

    })

})