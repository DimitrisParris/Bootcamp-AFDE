select film.film_id, film.title
from film
where film.film_id not in (
select inventory.film_id from inventory);