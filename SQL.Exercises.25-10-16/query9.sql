select category.name, avg(film.replacement_cost) cost, avg(film.rental_rate) rate
from film_category 
inner join film
on film_category.film_id=film.film_id
inner join category 
on category.category_id=film_category.category_id
group by film_category.category_id 
having cost-rate> 17