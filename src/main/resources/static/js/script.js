// $(function () {
//     $('#myButton').on('click', function () {
//         // http request
//         $.post("/cart", {id:1}, function (data){
//
//         }).done(function (data) {
//             $('#cart').text('Total: ' + data.length);
//         }).fail(function () {
//             alert('falled')
//         });
//     });
// });

$(function () {
        $(window).on('load', function () {
            if($.cookie('currentLocation') == null)
                $('#myModal').modal('show');
    });
    $('#priceToHigh').on('click', function () {
        $.get("/sortPrice/asc", function (data, status) {
            $('#productsContainer').html(data);
        })
    });
    $('#priceToLow').on('click', function () {
        $.get("/sortPrice/desc", function (data, status) {
            $('#productsContainer').html(data);
        })
    });

    $('#search').on('click', function () {
        var $checkedCheckboxes = $("#categories :checkbox:checked").closest("div.checkbox");
        var categ = $.map($checkedCheckboxes, function (val, i) {
            return $(val).prop("id");
        });
        $.get("/filter?categ=" + categ.join(), function (data, status) {
            $('#productsContainer').html(data);
        })
    });

    $('#addToCart').on('click', function () {
        $.post("/cartCount", {id: 1}, function (data) {
        }).done(function (data) {
            $('#cartCount').text(data.length);
        }).fail(function () {
            alert('falled')
        })
    });

    $(".dropdown-menu li a").click(function() {
        $("#cityName").text($(this).text());
    });


    $('#saveCity').click(function () {
        let city = $("#cityName").html();
        if(city !== null)
            $.cookie("currentLocation", city);
    })
})
