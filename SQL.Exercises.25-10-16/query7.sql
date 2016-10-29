select film_category.category_id, avg(film.replacement_cost - film.rental_rate) as difference
from film_category 
inner join film 
on film_category.film_id=film.film_id
group by film_category.category_id 
having difference > 17