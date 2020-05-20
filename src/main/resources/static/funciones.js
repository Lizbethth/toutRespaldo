
$(document).ready(function() {
    $('#tusuarios').DataTable();
});
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
});

function eliminarPac(id) {
    swal({
        title: "¿Esta seguro que desea eliminar este paciente?",
        text: "Esta operación es irreversible",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url: "/eliminarPac/" + id, success: function (res) {
                        console.log(res);
                    }
                });
                swal("Paciente eliminado", {
                    icon: "success",
                }).then((ok) => {
                    if (ok) {
                        location.href = "/listarPacientes";
                    }

                });
            } else {
                swal("Se canceló la operación");
            }
        });
}
function eliminar(id) {
    swal({
        title : "¿Esta seguro que desea eliminar este usuario?",
        text: "Esta operación es irreversible",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url: "/eliminar/"+id,success :function (res) {
                        console.log(res);
                    }
                });
                swal("Registro eliminado",{
                    icon: "success",
                }).then((ok)=>{
                    if (ok){
                        location.href="/listar";
                    }

                });
            } else {
                swal("Se canceló la operación");
            }
        });

}

