select film_category.category_id, film.title from film_category
inner join  film 
on film_category.film_id=film.film_id
order by film.title