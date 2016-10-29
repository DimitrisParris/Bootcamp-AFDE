select  actor.actor_id, actor.first_name, actor.last_name, count(film_actor.film_id) NumberOfFilms, film.length
from actor
inner join film_actor 
on actor.actor_id=film_actor.actor_id
inner join film
on  film.film_id=film_actor.film_id
where film.length>183
group by actor.actor_id, actor.first_name, actor.last_name
order by NumberOfFilms