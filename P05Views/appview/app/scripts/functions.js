'use strict';

function activeMenu(id) {
    $("#menu li").removeClass("active");
    $("#" + id).addClass("active");
    return;
}
