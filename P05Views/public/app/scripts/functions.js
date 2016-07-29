'use strict';

function activeMenu(id) {
    $("#menu li").removeClass("animated");
    $("#menu li").removeClass("infinite");
    $("#menu li").removeClass("swing");
    $("#menu li").removeClass("active");
    $("#" + id).addClass("active");
    $("#"+id).addClass("animated");
    $("#"+id).addClass("infinite");
    $("#"+id).addClass("swing");
    return;
}


function sitesAnimateLinks(){
  console.log("init animation");
  var sites=['firstsite','secondsite','thirdsite'];
  var id ='';
  for(var i in sites){
    id = sites[i];
    $("#"+id).removeClass("animated");
    $("#"+id).removeClass("infinite");
    $("#"+id).removeClass("bounce");
  }

  var aleatorio = 0;
  aleatorio = parseInt((Math.random()*74384612))%3;
  id = sites[aleatorio];
  $("#"+id).addClass("animated");
  $("#"+id).addClass("infinite");
  $("#"+id).addClass("bounce");
  console.log("finish animation");
}

$(
  function(){
    setInterval(
      function(){
        sitesAnimateLinks();
      },3000
    )
  }

);
